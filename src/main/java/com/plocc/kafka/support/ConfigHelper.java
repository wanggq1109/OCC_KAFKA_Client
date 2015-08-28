package com.plocc.kafka.support;

import java.io.InputStream;
import java.util.Properties;

/**
 * 配置辅助类
 * Created by zhanggj on 2015/7/23.
 */
public class ConfigHelper {

    private static Properties localProperties = loadProperties("/system.properties");
    private static Properties producerProperties = loadProducerProperties();
    private static Properties consumerProperties = loadConsumerProperties();
    private static Properties consumerThreadsProperties = loadConsumerThreadsProperties();

    /**
     * 加载配置文件
     *
     * @param filePath
     * @return
     */
    public static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        InputStream inputStream = ConfigHelper.class.getResourceAsStream(filePath);
        if (null != inputStream) {
            try {
                properties.load(inputStream);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return properties;
    }

    /**
     * 加载发送者配置信息
     *
     * @return
     */
    private static Properties loadProducerProperties() {
        Properties defaultProducerProperties = loadProperties("/default-kafka-producer.properties");
        Properties customerProducerProperties = loadProperties("/kafka-producer.properties");
        if (null != defaultProducerProperties) {
            defaultProducerProperties.putAll(customerProducerProperties);
        }
        return defaultProducerProperties;
    }

    /**
     * 加载订阅者配置信息
     *
     * @return
     */
    private static Properties loadConsumerProperties() {
        Properties defaultConsumerProperties = loadProperties("/default-kafka-consumer.properties");
        Properties customerConsumerProperties = loadProperties("/kafka-consumer.properties");
        if (null != customerConsumerProperties) {
            defaultConsumerProperties.putAll(customerConsumerProperties);
        }
        return defaultConsumerProperties;
    }

    /**
     * 加载订阅者配置信息
     *
     * @return
     */
    private static Properties loadConsumerThreadsProperties() {
        Properties defaultConsumerThreadsProperties = loadProperties("/default-kafka-consumer-threads.properties");
        Properties customerConsumerThreadsProperties = loadProperties("/kafka-consumer-threads.properties");
        if (null != customerConsumerThreadsProperties) {
            defaultConsumerThreadsProperties.putAll(customerConsumerThreadsProperties);
        }
        return defaultConsumerThreadsProperties;
    }

    /**
     * 读取默认配置
     *
     * @param property
     * @return
     */
    public static String getProperty(String property) {
        return localProperties.getProperty(property);
    }

    public static Properties getProducerProperties() {
        if (null == producerProperties) {
            producerProperties = loadProducerProperties();
        }
        return producerProperties;
    }

    public static Properties getConsumerProperties() {
        if (null == consumerProperties) {
            consumerProperties = loadConsumerProperties();
        }
        return consumerProperties;
    }

    public static Properties getConsumerThreadsProperties() {
        if (null == consumerThreadsProperties) {
            consumerThreadsProperties = loadConsumerThreadsProperties();
        }
        return consumerThreadsProperties;
    }

    /**
     * 生成 Topic
     *
     * @param system 系统编号
     * @param topic  业务编码(SEND_SMS,ADD_CUSTOMER,DELETE_USER.....)
     * @return
     */
    public static Topic buildTopic(String system, String topic, Integer partitionsCount) {
        if (null == system || null == topic || topic.trim().length() == 0) {
            throw new RuntimeException("生成Topic参数异常");
        }
        return new Topic(new StringBuffer().append(system).append("_").append(topic).toString(), partitionsCount);
    }

    public static Topic buildTopic(String system, String topic) {
        if (null == system || null == topic || topic.trim().length() == 0) {
            throw new RuntimeException("生成Topic参数异常");
        }
        return buildTopic(system, topic, 10);
    }

}
