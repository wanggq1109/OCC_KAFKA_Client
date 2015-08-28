package com.plocc.kafka.consumer;

import com.plocc.kafka.model.Msg;
import com.plocc.kafka.support.Topic;

/**
 * 消息订阅处理接口
 */
public interface MsgHandler<T extends Msg> {
    // 主题
    public Topic getTopic();

    public void execute(T message);
}
