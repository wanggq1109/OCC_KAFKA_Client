package com.plocc.kafka.model;

import java.util.Date;

/**
 * Created by z8242_000 on 2015/7/31.
 */
public class ParkingLeaveMsg extends Msg {
	private Long userId;

	private String mallId;
	
	private String mallName;
	//出口
	private String exitNo;
	//车牌号
	private String plateNo;
	//离场时间
	private Date leaveTime;
	//总费用
	private Double amount;
	
	//免费停车时长
	private Integer discount;
	//支付方式
	private String paymentType;
	//支付时间
	private Date paymentTime;
	//系统
	private String toller;
	
	private String sign;
	
	private String nonce;
	
	private String timestamp;

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

	/**
	 * @return the exitNo
	 */
	public String getExitNo() {
		return exitNo;
	}

	/**
	 * @param exitNo the exitNo to set
	 */
	public void setExitNo(String exitNo) {
		this.exitNo = exitNo;
	}

	/**
	 * @return the plateNo
	 */
	public String getPlateNo() {
		return plateNo;
	}

	/**
	 * @param plateNo the plateNo to set
	 */
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	/**
	 * @return the leaveTime
	 */
	public Date getLeaveTime() {
		return leaveTime;
	}

	/**
	 * @param leaveTime the leaveTime to set
	 */
	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the discount
	 */
	public Integer getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the paymentTime
	 */
	public Date getPaymentTime() {
		return paymentTime;
	}

	/**
	 * @param paymentTime the paymentTime to set
	 */
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	/**
	 * @return the toller
	 */
	public String getToller() {
		return toller;
	}

	/**
	 * @param toller the toller to set
	 */
	public void setToller(String toller) {
		this.toller = toller;
	}

	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * @param sign the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * @return the nonce
	 */
	public String getNonce() {
		return nonce;
	}

	/**
	 * @param nonce the nonce to set
	 */
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
