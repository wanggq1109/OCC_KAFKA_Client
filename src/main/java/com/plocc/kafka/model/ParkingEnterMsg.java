package com.plocc.kafka.model;

import java.util.Date;

/**
 * 车辆进场消息
 */
public class ParkingEnterMsg extends Msg {
    private String mallId;

	private Long userId;
    
    private String mallName;
    //入口
    private String entrance;
    //车牌号
    private String plateNo;
    //入场时间
    private Date entryTime;
    
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
	 * @return the entrance
	 */
	public String getEntrance() {
		return entrance;
	}

	/**
	 * @param entrance the entrance to set
	 */
	public void setEntrance(String entrance) {
		this.entrance = entrance;
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
	 * @return the entryTime
	 */
	public Date getEntryTime() {
		return entryTime;
	}

	/**
	 * @param entryTime the entryTime to set
	 */
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
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
