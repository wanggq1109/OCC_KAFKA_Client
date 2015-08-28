package com.plocc.kafka.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by z8242_000 on 2015/7/31.
 */
public class QrcodeScanOrderMsg extends Msg {
    private String user;
    private String mobile;
    private String batch;

    private String deviceId; //POS机设备id
    private BigDecimal amount; //金额
    private Date payTime; //支付时间
    private String orderNo;//pos订单编号


    private String Date;
    

    public String getUser() {
        return user;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
    
    
}
