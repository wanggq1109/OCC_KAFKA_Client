package com.plocc.kafka.consumer;

import com.alibaba.fastjson.JSON;
import com.plocc.kafka.model.Msg;
import com.plocc.kafka.model.UserNotifyMsg;
import com.plocc.kafka.support.ConfigHelper;
import com.plocc.kafka.support.async.impl.AsyncExecuteServiceImpl;
import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.message.MessageAndMetadata;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wgq on 2015/7/24.
 */
public class MsgSubscriberImpl implements MsgSubscriber {
    private static final Charset charset = Charset.forName("utf8");
    private ConsumerConnector consumer;
    private AsyncExecuteServiceImpl asyncExecuteService = new AsyncExecuteServiceImpl();

    public MsgSubscriberImpl() {
        // 属性配置
        ConsumerConfig consumerConfig = new ConsumerConfig(ConfigHelper.getConsumerProperties());
        consumer = Consumer.createJavaConsumerConnector(consumerConfig);
    }

    /**
     * 订阅消息
     *
     * @param messageExecutor
     */
    public void subscribe(MsgHandler messageExecutor) {

        if (!asyncExecuteService.isRunning()) {
            asyncExecuteService.setCorePoolSize(messageExecutor.getTopic().getPartitionsCount());
            asyncExecuteService.start();
        }
        Map<String, Integer> topics = new HashMap<String, Integer>();
        topics.put(messageExecutor.getTopic().getTopicName(), messageExecutor.getTopic().getPartitionsCount());
        Map<String, List<KafkaStream<byte[], byte[]>>> streams = consumer.createMessageStreams(topics);
        List<KafkaStream<byte[], byte[]>> partitions = streams.get(messageExecutor.getTopic().getTopicName());
        for (KafkaStream<byte[], byte[]> partition : partitions) {
            asyncExecuteService.submitTask(new AsyncTask(partition, messageExecutor));
        }
    }

    class AsyncTask extends com.plocc.kafka.support.async.task.AsyncTask {
        private KafkaStream<byte[], byte[]> partition;
        private MsgHandler messageExecutor;

        AsyncTask(KafkaStream<byte[], byte[]> partition, MsgHandler messageExecutor) {
            this.partition = partition;
            this.messageExecutor = messageExecutor;
        }

        public Object doInAsync() {
            ConsumerIterator<byte[], byte[]> iterator = partition.iterator();
            while (iterator.hasNext()) {
                MessageAndMetadata<byte[], byte[]> item = iterator.next();
                try {
                    consumer.commitOffsets(true);
                    String message = new String(item.message(), charset);
                    messageExecutor.execute((Msg) JSON.parse(message));
                } catch (Exception ex) {
                    consumer.commitOffsets(false);
                    ex.printStackTrace();
                }
            }
            return null;
        }
    }
}
