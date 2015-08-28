package com.plocc.kafka.model;

import java.util.Date;

/**
 * Created by z8242_000 on 2015/7/31.
 */
public class TestMsg extends Msg {
    // 测试编号
    private Integer id;
    // 测试名称
    private String name;
    // 创建内容
    private String content;

    private String tag;
    private String payload;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    // 创建时间
    private Date create;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }
}
