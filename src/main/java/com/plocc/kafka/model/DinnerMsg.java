package com.plocc.kafka.model;

import java.util.Date;

/** 
 * @author: xiaojh 
 * @date: 2015年8月24日
 * @Description: 
 */
public class DinnerMsg extends Msg {
	private String openId;
	//来源提示
	private String sfrom;
	//排号单流水号
	private String serialId;
	//手机号 
	private String mobile;
	//商家名称
	private String name;
	//接入方orderid
	private String orderId;
	//号码
	private String num;
	//餐桌
	private String qname;
	//队列属性
	private String qattr;
	//队列类型
	private String[] type;
	//人数
	private Integer people;
	//信誉值
	private Integer credit;
	//排号单状态
	private Integer state;
	//变更提示
	private String desc;
	//还需等待人数
	private Integer wait;
	//推送时间
	private Date pushTime;
	//签名
	private String sign;
	/**
	 * @return the openId
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * @param openId the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * @return the sfrom
	 */
	public String getSfrom() {
		return sfrom;
	}
	/**
	 * @param sfrom the sfrom to set
	 */
	public void setSfrom(String sfrom) {
		this.sfrom = sfrom;
	}
	/**
	 * @return the serialId
	 */
	public String getSerialId() {
		return serialId;
	}
	/**
	 * @param serialId the serialId to set
	 */
	public void setSerialId(String serialId) {
		this.serialId = serialId;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}
	/**
	 * @return the qname
	 */
	public String getQname() {
		return qname;
	}
	/**
	 * @param qname the qname to set
	 */
	public void setQname(String qname) {
		this.qname = qname;
	}
	/**
	 * @return the qattr
	 */
	public String getQattr() {
		return qattr;
	}
	/**
	 * @param qattr the qattr to set
	 */
	public void setQattr(String qattr) {
		this.qattr = qattr;
	}
	/**
	 * @return the type
	 */
	public String[] getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String[] type) {
		this.type = type;
	}
	/**
	 * @return the people
	 */
	public Integer getPeople() {
		return people;
	}
	/**
	 * @param people the people to set
	 */
	public void setPeople(Integer people) {
		this.people = people;
	}
	/**
	 * @return the credit
	 */
	public Integer getCredit() {
		return credit;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	/**
	 * @return the state
	 */
	public Integer getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the wait
	 */
	public Integer getWait() {
		return wait;
	}
	/**
	 * @param wait the wait to set
	 */
	public void setWait(Integer wait) {
		this.wait = wait;
	}
	/**
	 * @return the pushTime
	 */
	public Date getPushTime() {
		return pushTime;
	}
	/**
	 * @param pushTime the pushTime to set
	 */
	public void setPushTime(Date pushTime) {
		this.pushTime = pushTime;
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
}
