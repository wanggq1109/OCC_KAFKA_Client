package com.plocc.kafka.model;

import java.util.Date;

/** 
 * @author: xiaojh 
 * @date: 2015年7月31日
 * @Description: 
 */
public class PosReceiptMsg extends Msg {
	//广场Id
	private String mallId;
	//广场名称
	private String mallName;
	//小票单号
	private String receiptNum;
	//设备编号
	private String cptid;
	//交易时间
	private Date tsdate;
	//实付金额
	private Double totalAmount;
	//二维码编号
	private String qrcode;
	
	private String tsid;
	//商号ID
	private String merchantId;
	//商户名称
	private String merchantName;
	
	private Double enterAmount;
	//是否生产
	private String productIf;
	
	private String imageUrl;
	//支付方式
	private String paymentType;
	
	private String modelType;
	
	private String txtString;
	//创建时间
	private Date createTime;
	
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
	 * @return the receiptNum
	 */
	public String getReceiptNum() {
		return receiptNum;
	}

	/**
	 * @param receiptNum the receiptNum to set
	 */
	public void setReceiptNum(String receiptNum) {
		this.receiptNum = receiptNum;
	}

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
	 * @return the tsdate
	 */
	public Date getTsdate() {
		return tsdate;
	}

	/**
	 * @param tsdate the tsdate to set
	 */
	public void setTsdate(Date tsdate) {
		this.tsdate = tsdate;
	}

	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @return the qrcode
	 */
	public String getQrcode() {
		return qrcode;
	}

	/**
	 * @param qrcode the qrcode to set
	 */
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	/**
	 * @return the tsid
	 */
	public String getTsid() {
		return tsid;
	}

	/**
	 * @param tsid the tsid to set
	 */
	public void setTsid(String tsid) {
		this.tsid = tsid;
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
	 * @return the enterAmount
	 */
	public Double getEnterAmount() {
		return enterAmount;
	}

	/**
	 * @param enterAmount the enterAmount to set
	 */
	public void setEnterAmount(Double enterAmount) {
		this.enterAmount = enterAmount;
	}

	/**
	 * @return the productIf
	 */
	public String getProductIf() {
		return productIf;
	}

	/**
	 * @param productIf the productIf to set
	 */
	public void setProductIf(String productIf) {
		this.productIf = productIf;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
	 * @return the modelType
	 */
	public String getModelType() {
		return modelType;
	}

	/**
	 * @param modelType the modelType to set
	 */
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	/**
	 * @return the txtString
	 */
	public String getTxtString() {
		return txtString;
	}

	/**
	 * @param txtString the txtString to set
	 */
	public void setTxtString(String txtString) {
		this.txtString = txtString;
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
}
