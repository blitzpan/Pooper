package com.pooper.bean;

public class RText extends RMsg {
	private String Content;//	文本消息内容

	public RText(String toUserName, String fromUserName, String createTime, String msgType, String msgId, String content) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		Content = content;
	}
	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	@Override
	public String toString() {
		return "RText [Content=" + Content + "]";
	}
}
