package com.plocc.kafka.model;

import java.util.Date;
import java.util.List;

import com.plocc.kafka.model.Msg;

/** 
 * @author: xiaojh 
 * @date: 2015年8月12日
 * @Description: 
 */
public class PayVoMsg extends Msg {
	private String mallId;
	
	private String mallName;
	
	private Double amount;
	//车牌号
	public String plateNo;
	//用户ID
	public String userId;
	//支付时间
	public Date paymentTime;
	
	public Long parkingDetailId;
	/**
	 * @return the parkingDetailId
	 */
	public Long getParkingDetailId() {
		return parkingDetailId;
	}
	/**
	 * @param parkingDetailId the parkingDetailId to set
	 */
	public void setParkingDetailId(Long parkingDetailId) {
		this.parkingDetailId = parkingDetailId;
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
	//支付汇总数据
	public List<PayStatisticMsg> payList;
	
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the payList
	 */
	public List<PayStatisticMsg> getPayList() {
		return payList;
	}
	/**
	 * @param payList the payList to set
	 */
	public void setPayList(List<PayStatisticMsg> payList) {
		this.payList = payList;
	}
}
