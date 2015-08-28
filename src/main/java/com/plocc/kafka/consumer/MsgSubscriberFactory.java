package com.plocc.kafka.consumer;

import com.plocc.kafka.KafkaLocator;
import com.plocc.kafka.support.ConfigHelper;
import com.plocc.kafka.support.Topic;
import com.plocc.kafka.support.TopicHelper;

import java.util.List;

/**
 * Created by wgq on 2015/7/27.
 */
public final class MsgSubscriberFactory {
    public MsgSubscriberFactory(List<MsgHandler> handlers) {
        for (MsgHandler handler : handlers) {
            KafkaLocator.buildSubscribe().subscribe(handler);
        }
    }
}
