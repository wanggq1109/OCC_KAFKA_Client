package com.plocc.kafka.model;

/**
 * Created by z8242_000 on 2015/8/6.
 */
public class PushDbMsg {
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
