package com.plocc.kafka.model;

/**
 * 券码购买MSGVO
 * Created by Angus on 2015/8/13.
 */
public class TicketMsg extends Msg {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户MALL
     */
    private String mallId;
    /**
     * 消息类型 (1 获得券 2使用券)
     */
    private String type;
    /**
     * 券码名称 如果是电影就是电影名称 团购就是团购商品名称
     */
    private String itemName;
    /**
     * 券码NO
     */
    private String ticketNo;
    /**
     * 开始时间 例:(2013-08-07)
     */
    private String beginDateCN;
    /**
     * 结束时间  例:(2013-08-08)
     */
    private String endDateCN;
    /**
     * 使用券的时候才有使用时间
     * 使用时间 例(2015-08-07 17:58)
     */
    private String useDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getBeginDateCN() {
        return beginDateCN;
    }

    public void setBeginDateCN(String beginDateCN) {
        this.beginDateCN = beginDateCN;
    }

    public String getEndDateCN() {
        return endDateCN;
    }

    public void setEndDateCN(String endDateCN) {
        this.endDateCN = endDateCN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(String useDate) {
        this.useDate = useDate;
    }
}
