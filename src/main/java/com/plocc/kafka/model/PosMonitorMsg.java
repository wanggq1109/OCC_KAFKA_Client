package com.plocc.kafka.model;

import java.util.Date;

/** 
 * @author: xiaojh 
 * @date: 2015年7月31日
 * @Description: 
 */
public class PosMonitorMsg extends Msg{
	//设备ID
    private String cptid;
    //商户ID
    private String merchantId;
    //商户名称
    private String merchantName;
    //第一次心跳 时间
    private Date beginTime;
    //最后一次心跳时间
    private Date endTime;
    //交易数据
    private Integer receiptSum;
    //创建时间
    private Date createTime;
    //交易总额
    private Double totalSum;

    private String mallId;

    private String mallName;

	/**
	 * @return the cptid
	 */
	public String getCptid() {
		return cptid;
	}

	/**
	 * @param cptid the cptid to set
	 */
	public void setCptid(String cptid) {
		this.cptid = cptid;
	}

	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * @return the merchantName
	 */
	public String getMerchantName() {
		return merchantName;
	}

	/**
	 * @param merchantName the merchantName to set
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	/**
	 * @return the beginTime
	 */
	public Date getBeginTime() {
		return beginTime;
	}

	/**
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the receiptSum
	 */
	public Integer getReceiptSum() {
		return receiptSum;
	}

	/**
	 * @param receiptSum the receiptSum to set
	 */
	public void setReceiptSum(Integer receiptSum) {
		this.receiptSum = receiptSum;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the totalSum
	 */
	public Double getTotalSum() {
		return totalSum;
	}

	/**
	 * @param totalSum the totalSum to set
	 */
	public void setTotalSum(Double totalSum) {
		this.totalSum = totalSum;
	}

	/**
	 * @return the mallId
	 */
	public String getMallId() {
		return mallId;
	}

	/**
	 * @param mallId the mallId to set
	 */
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	/**
	 * @return the mallName
	 */
	public String getMallName() {
		return mallName;
	}

	/**
	 * @param mallName the mallName to set
	 */
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
}
