package com.plocc.kafka.support;

/**
 * 主题信息
 */
public class Topic<T> {
    // topic名字
    private String topicName;

    // 分块数量 处理消息通道数、换句话就是 同时开启多少个线程去处理
    private Integer partitionsCount = 1;

    public Topic(String topicName, Integer partitionsCount) {
        this.topicName = topicName;
        this.partitionsCount = partitionsCount;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Integer getPartitionsCount() {
        return partitionsCount;
    }

    public void setPartitionsCount(Integer partitionsCount) {
        this.partitionsCount = partitionsCount;
    }
}
