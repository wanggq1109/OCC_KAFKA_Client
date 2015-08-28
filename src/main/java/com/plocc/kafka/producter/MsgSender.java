package com.plocc.kafka.producter;

import com.plocc.kafka.model.Msg;
import com.plocc.kafka.support.Topic;

/**
 * 消息发送器 Created by wgq on 2015/7/23
 */
public interface MsgSender<T extends Msg> {

    /**
     * 发送消息
     *
     * @param topic   主题
     * @param message 消息体
     */
    void sendMessage(Topic topic, T... message);

    /**
     * 发送消息
     *
     * @param message 消息体
     */
    void sendMessage(T message);

}
