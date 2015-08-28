package com.plocc.kafka.producter;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.plocc.kafka.model.Msg;
import com.plocc.kafka.model.UserNotifyMsg;
import com.plocc.kafka.support.ConfigHelper;
import com.plocc.kafka.support.Topic;
import com.plocc.kafka.support.async.AsyncExecuteService;
import com.plocc.kafka.support.async.impl.AsyncExecuteServiceImpl;
import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import org.apache.log4j.Logger;

/**
 * 默认消息发送器
 * <p/>
 * Created by wgq on 2015/7/23
 */
public class MsgSenderImpl<T extends Msg> implements MsgSender<T> {
    private static final Logger log = Logger.getLogger(MsgSenderImpl.class);
    // 属性配置
    private static ProducerConfig producerConfig = null;
    // 生成producer
    private Producer<String, String> producer = new Producer<String, String>(producerConfig);
    private Topic topic;

    public MsgSenderImpl(Topic topic) {
        if (null == producerConfig) {
            producerConfig = new ProducerConfig(ConfigHelper.getProducerProperties());
        }
        this.topic = topic;
    }

    // 发送消息
    public void sendMessage(Topic topic, T... messages) {
        // 消息
        for (T message : messages) {
            String jsonMessage = JSONObject.toJSONString(message, SerializerFeature.WriteClassName);
            // 发送
            producer.send(new KeyedMessage<String, String>(topic.getTopicName(), jsonMessage, jsonMessage));
            log.debug("send,topic:" + topic + ",message:" + jsonMessage);
        }
    }

    // 发送消息
    public void sendMessage(T message) {
        sendMessage(topic, message);
    }

}
