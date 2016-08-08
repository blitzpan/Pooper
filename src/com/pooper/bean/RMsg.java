package com.pooper.bean;

/**
 * ClassName: RMsg 
 * @Description: 接收到的消息
 * @author Panyk
 * @date 2016年8月8日
 */

public class RMsg {
	private String ToUserName;//	开发者微信号
	private String FromUserName;//	发送方帐号（一个OpenID）
	private String CreateTime;//	消息创建时间 （整型）
	private String MsgType;//
	private String MsgId;//	消息id，64位整型

	public RMsg(String toUserName, String fromUserName, String createTime, String msgType, String msgId) {
		super();
		ToUserName = toUserName;
		FromUserName = fromUserName;
		CreateTime = createTime;
		MsgType = msgType;
		MsgId = msgId;
	}
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	@Override
	public String toString() {
		return "RMsg [ToUserName=" + ToUserName + ", FromUserName=" + FromUserName + ", CreateTime=" + CreateTime
				+ ", MsgType=" + MsgType + ", MsgId=" + MsgId + "]";
	}
}