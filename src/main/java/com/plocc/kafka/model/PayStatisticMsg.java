package com.plocc.kafka.model;
/** 
 * @author: xiaojh 
 * @date: 2015年8月12日
 * @Description: 
 */
public class PayStatisticMsg {
	//支付类型
	public Integer paymentType;
	//支付类型CN
	public String paymentTypeCn;
	//支付时长
	public Long payParkingTime;
	//支付数量
	public String paymentNum;
	/**
	 * @return the paymentType
	 */
	public Integer getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the paymentTypeCn
	 */
	public String getPaymentTypeCn() {
		return paymentTypeCn;
	}
	/**
	 * @param paymentTypeCn the paymentTypeCn to set
	 */
	public void setPaymentTypeCn(String paymentTypeCn) {
		this.paymentTypeCn = paymentTypeCn;
	}
	/**
	 * @return the payParkingTime
	 */
	public Long getPayParkingTime() {
		return payParkingTime;
	}
	/**
	 * @param payParkingTime the payParkingTime to set
	 */
	public void setPayParkingTime(Long payParkingTime) {
		this.payParkingTime = payParkingTime;
	}
	/**
	 * @return the paymentNum
	 */
	public String getPaymentNum() {
		return paymentNum;
	}
	/**
	 * @param paymentNum the paymentNum to set
	 */
	public void setPaymentNum(String paymentNum) {
		this.paymentNum = paymentNum;
	}
}
