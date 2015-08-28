package com.plocc.kafka.model;

import java.sql.Timestamp;
import java.util.Date;

/** 
 * @author: wangfei
 * @date: 2015年8月1日
 * @Description: 
 */
public class PlcrmScoreChangeMsg  extends Msg{

	private String memberName;			//会员名称
	private String memberMobile;		//会员手机
	private String scMemberDetailId;	//积分变动ID
	private String mallId;				//积分商场ID
	private String mallName;			//积分商场name
	private String shopId;				//消费商家Id
	private String shopNameCn;			//消费商家
	private String shopNameEn;			//消费商家
	private String opType;				//积分变动原因
	private String opTypeName;			//积分变动原因
	private String isadd;				//0:增加，1:减少
	private long score;					//本次变动积分
	private long scoreTotal;			//变动后积分
	private String remark;				//备注
	private String creator;
	private Date createdDate;
	
	public String getMemberName() {
		return memberName;
	}
	public String getMemberMobile() {
		return memberMobile;
	}
	public String getScMemberDetailId() {
		return scMemberDetailId;
	}
	public String getMallId() {
		return mallId;
	}
	public String getMallName() {
		return mallName;
	}
	public String getShopId() {
		return shopId;
	}
	public String getShopNameCn() {
		return shopNameCn;
	}
	public String getShopNameEn() {
		return shopNameEn;
	}
	public String getOpType() {
		return opType;
	}
	public String getOpTypeName() {
		return opTypeName;
	}
	public long getScore() {
		return score;
	}
	public long getScoreTotal() {
		return scoreTotal;
	}
	public String getIsadd() {
		return isadd;
	}
	public String getRemark() {
		return remark;
	}
	public String getCreator() {
		return creator;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}
	public void setScMemberDetailId(String scMemberDetailId) {
		this.scMemberDetailId = scMemberDetailId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public void setShopNameCn(String shopNameCn) {
		this.shopNameCn = shopNameCn;
	}
	public void setShopNameEn(String shopNameEn) {
		this.shopNameEn = shopNameEn;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}
	public void setOpTypeName(String opTypeName) {
		this.opTypeName = opTypeName;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public void setScoreTotal(long scoreTotal) {
		this.scoreTotal = scoreTotal;
	}
	public void setIsadd(String isadd) {
		this.isadd = isadd;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
