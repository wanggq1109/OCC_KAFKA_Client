package com.plocc.kafka.model;

/**
 * 短信推送
 */
public class PushSmsMsg {

    // 手机号码
    private String mobile;
    // 内容
    private String content;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
