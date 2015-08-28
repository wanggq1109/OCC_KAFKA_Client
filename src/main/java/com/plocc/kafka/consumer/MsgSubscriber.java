package com.plocc.kafka.consumer;

import com.plocc.kafka.model.Msg;
import com.plocc.kafka.support.Topic;

/**
 * Created by wgq on 2015/7/24.
 */
public interface MsgSubscriber<T extends Msg> {

    /**
     * 订阅消息
     *
     * @param messageExecutor
     */
    public void subscribe(MsgHandler<T> messageExecutor);

}
