package com.plocc.kafka;

import com.plocc.kafka.consumer.MsgSubscriber;
import com.plocc.kafka.consumer.MsgSubscriberImpl;
import com.plocc.kafka.model.Msg;
import com.plocc.kafka.producter.MsgSender;
import com.plocc.kafka.producter.MsgSenderImpl;
import com.plocc.kafka.support.Topic;

/**
 * Created by wgq on 2015/7/23.
 */
public class KafkaLocator {
    public static MsgSender buildSender(Topic<? extends Msg> topic) {
        // 发送器
        return new MsgSenderImpl(topic);
    }

    public static MsgSubscriber buildSubscribe() {
        return new MsgSubscriberImpl();
    }
}
