package com.plocc.kafka.model;

/**
 * APP消息推送
 */
public class PushAppMsg {

    private String tag;
    private String content;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
