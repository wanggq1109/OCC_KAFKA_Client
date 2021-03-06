package com.plocc.kafka.model;

/**
 * 微信消息推送
 */
public class PushWeixinMsg extends Msg {

    // 用户标识
    private String user;
    // 推送内容
    private String content;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
