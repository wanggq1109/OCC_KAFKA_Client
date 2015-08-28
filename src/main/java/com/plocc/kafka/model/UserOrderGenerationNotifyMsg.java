package com.plocc.kafka.model;

import java.util.Date;

/**
 * 用户系统通知
 */
public class UserOrderGenerationNotifyMsg extends UserNotifyMsg {

    // 消息类型
    public UserNotifyMsgType getNotifyType() {
        return UserNotifyMsgType.UserSystemNotify;
    }

}
