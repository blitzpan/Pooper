package com.pooper.action;

import java.io.InputStream;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pooper.bean.RMsg;
import com.pooper.utils.XmlUtils;

@Controller
@RequestMapping(value="/weChatCon")
public class WeChatController {
	private Logger log = Logger.getLogger(WeChatController.class);
	
	
	@RequestMapping(value="/wechat",method=RequestMethod.GET)
	@ResponseBody
	public Object wechat(String signature,String timestamp,String nonce,String echostr){
		try{
			log.debug(signature + "-" + timestamp + "-" +nonce + "-" +echostr);
		}catch(Exception e){
			log.error("wechat=", e);
		}
		return echostr;
	}
	@RequestMapping(value="/wechat", method=RequestMethod.POST)
	@ResponseBody
	public Object wechat(HttpServletRequest request){
		String res = "未定义";
		try{
			String xml = StreamUtils.copyToString((InputStream)request.getInputStream(), Charset.forName("UTF-8"));
			log.debug("xml=" + xml);
			RMsg msg = XmlUtils.parseXml(xml);
			res = XmlUtils.buildXml(msg);
		}catch(Exception e){
			log.error("wechat=", e);
		}
		return res;
	}
}
