package com.maxiaohua.genealogy.fw.core.sms.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.ErrorLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;
import com.maxiaohua.genealogy.fw.core.sms.SMSManager;

public class SMSManagerImpl implements SMSManager{
	
	private static final String SMS_URI="http://www.512688.com/WS/Send.aspx";
	protected static final Logger appLogger = LogFactory.getLogger();
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();
	protected static final ErrorLogger errorLogger = LogFactory.getErrorLogger();

	@Override
	public boolean sendSMS(String mobile, String message) {
		URL url = null;
		String CorpID="V02337";//账户名
		String Pwd="123123";//密码

		String send_content = null;
		try {
			send_content = URLEncoder.encode(message.replaceAll("<br/>", " "), "GBK");//发送内容
			url = new URL(SMS_URI+"?CorpID="+CorpID+"&Pwd="+Pwd+"&Mobile="+mobile+"&Content="+send_content+"&Cell=&SendTime=");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			if(new Integer(in.readLine()).intValue() == 0){
				return true;
			}
		} catch (UnsupportedEncodingException e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
		} catch (MalformedURLException e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
		} catch (IOException e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
		} catch (NumberFormatException e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
		}
		return false;
	}

}
