package com.plocc.kafka.model;
/** 
 * @author: xiaojh 
 * @date: 2015年8月17日
 * @Description: 退单数据
 */
public class PosTxnMsg extends Msg {
	//调备号
	private String sn;
	//订单号
	private String paymentOrder;
	//退单金额
	private Double amount;
	//类型
	private String txnType;

	/**
	 * @return the sn
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * @param sn the sn to set
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * @return the paymentOrder
	 */
	public String getPaymentOrder() {
		return paymentOrder;
	}

	/**
	 * @param paymentOrder the paymentOrder to set
	 */
	public void setPaymentOrder(String paymentOrder) {
		this.paymentOrder = paymentOrder;
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
	 * @return the txnType
	 */
	public String getTxnType() {
		return txnType;
	}

	/**
	 * @param txnType the txnType to set
	 */
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
}
