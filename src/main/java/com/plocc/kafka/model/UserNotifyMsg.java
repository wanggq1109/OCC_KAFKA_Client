package com.plocc.kafka.model;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * Created by z8242_000 on 2015/7/31.
 */
public abstract class UserNotifyMsg extends Msg {

    /**
     * 通知类型
     *
     * @return
     */
    public abstract UserNotifyMsgType getNotifyType();
}

