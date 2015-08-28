package com.plocc.kafka.model;

import java.util.Date;

/**
 * 用户系统通知
 */
public class UserSystemNotifyMsg extends UserNotifyMsg {

    /**
     * 通知人
     */
    private Long notifier;

    /**
     * 被通知人
     */
    private Long notityObject;

    /**
     * 通知内容
     */
    private String notityBody;

    /**
     * 通知分类
     */
    private String notityType;

    /**
     * 通知状态
     */
    private String notityStat;

    /**
     * 阅读时间
     */
    private Date readingTime;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date updateDate;

    /**
     * 生效时间
     */
    private Date effectiveDate;

    /**
     * 失效时间
     */
    private Date failureDate;

    /**
     * 是否删除
     */
    private String isDel;
    /**
     * 是否提醒
     */
    private String isNotice;
    /**
     * mall编号
     */
    private Long mallId;


    // 消息类型
    public UserNotifyMsgType getNotifyType() {
        return UserNotifyMsgType.UserSystemNotify;
    }

    public Long getNotifier() {
        return notifier;
    }

    public void setNotifier(Long notifier) {
        this.notifier = notifier;
    }

    public Long getNotityObject() {
        return notityObject;
    }

    public void setNotityObject(Long notityObject) {
        this.notityObject = notityObject;
    }

    public String getNotityBody() {
        return notityBody;
    }

    public void setNotityBody(String notityBody) {
        this.notityBody = notityBody;
    }

    public String getNotityType() {
        return notityType;
    }

    public void setNotityType(String notityType) {
        this.notityType = notityType;
    }

    public String getNotityStat() {
        return notityStat;
    }

    public void setNotityStat(String notityStat) {
        this.notityStat = notityStat;
    }

    public Date getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(Date readingTime) {
        this.readingTime = readingTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getFailureDate() {
        return failureDate;
    }

    public void setFailureDate(Date failureDate) {
        this.failureDate = failureDate;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
    }

    public Long getMallId() {
        return mallId;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }
}
