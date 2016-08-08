package com.pooper.utils;

import java.util.Date;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.pooper.bean.RMsg;
import com.pooper.bean.RText;

public class XmlUtils {
	Logger log = Logger.getLogger(XmlUtils.class);

	public static RMsg parseXml(String xml) throws Exception {
		Document document = null;
		RMsg msg = null;
		try {
			document = DocumentHelper.parseText(xml);
			String toUserName = document.getRootElement().element("ToUserName").getText();
			String fromUserName = document.getRootElement().element("FromUserName").getText();
			String createTime = document.getRootElement().element("CreateTime").getText();
			String msgType = document.getRootElement().element("MsgType").getText();
			String msgId = document.getRootElement().element("MsgId").getText();
			if (msgType.equals("text")) {// 文本
				String content = document.getRootElement().element("Content").getText();
				msg = new RText(toUserName, fromUserName, createTime, msgType, msgId, content);
			}
		} catch (Exception e) {
			throw e;
		}
		return msg;

		/*
		 * Iterator allElement = data.elementIterator();
		 * 
		 * while(allElement.hasNext()){ Element element =
		 * (Element)allElement.next();
		 * if("string".equals(element.getName().trim())){ str =
		 * element.getText(); } if("table".equals(element.getName().trim())){
		 * Iterator tableElements = element.elementIterator();
		 * while(tableElements.hasNext()){ Element tableElement =
		 * (Element)tableElements.next();
		 * if("tablename".equals(tableElement.getName().trim())){ table = table
		 * + tableElement.getText()+""; }
		 * if("tablecontent".equals(tableElement.getName().trim())){ table +=
		 * "<table class='itesubtable'>"; Iterator rows =
		 * tableElement.elementIterator("row"); String fontColor = "";
		 * while(rows.hasNext()){ Element row = (Element)rows.next(); fontColor
		 * = row.attributeValue("color"); table += "<tr class='itesubtitle'>";
		 * Iterator cols = row.elementIterator("col"); while(cols.hasNext()){
		 * Element col = (Element)cols.next(); table += "<td>"; table +=
		 * "<font color='"+fontColor+"'>"+col.attributeValue("name")+"</font>";
		 * table += "</td>"; } table += "</tr>"; } table += "</table>"; }
		 * 
		 * } } }
		 */
	}

	// 生成xml
	public static String buildXml(RMsg msg) throws Exception {
		// 2.第二种 创建文档及设置根元素节点的方式
		Element root = DocumentHelper.createElement("");
		Document document = DocumentHelper.createDocument(root);
		// 给根节点添加孩子节点
		root.addElement("FromUserName").addText(msg.getFromUserName());
		root.addElement("ToUserName").addText(msg.getToUserName());
		root.addElement("CreateTime").addText(new Date().getTime() + "");
		root.addElement("MsgType").addText(msg.getMsgType());
		if(msg.getMsgType().equals("text")){
			RText text = (RText)msg;
			root.addElement("Content").addText(text.getContent());
		}
		return document.asXML();
	}

	public static void main(String[] args) {
		String xml = "<xml><URL><![CDATA[http://115.28.72.34/pooper/weChatCon/wechat.action]]></URL><ToUserName><![CDATA[a]]></ToUserName>"
				+ "<FromUserName><![CDATA[b]]></FromUserName>" + "<CreateTime>12</CreateTime>"
				+ "<MsgType><![CDATA[text]]></MsgType>" + "<Content><![CDATA[你好]]></Content>" + "<MsgId>1</MsgId>"
				+ "</xml>";
		try {
			RMsg msg = XmlUtils.parseXml(xml);
			System.out.println(msg.toString());
			System.out.println(XmlUtils.buildXml(msg));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}