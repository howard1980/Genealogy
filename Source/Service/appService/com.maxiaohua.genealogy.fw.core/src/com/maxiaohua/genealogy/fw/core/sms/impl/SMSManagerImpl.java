package com.maxiaohua.genealogy.fw.core.sms.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Set;

import com.cloopen.rest.sdk.CCPRestSDK;
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
	
	@Override
	public boolean sendVerifyCode(String mobile, String verifyCode) {
		HashMap<String, Object> result = null;

		CCPRestSDK restAPI = new CCPRestSDK();
		restAPI.init("sandboxapp.cloopen.com", "8883");
		// 初始化服务器地址和端口，沙盒环境配置成sandboxapp.cloopen.com，生产环境配置成app.cloopen.com，端口都是8883.
		restAPI.setAccount("8a48b5514fa577af014faab63b050e5b", "1f96f29700e646898744edc93b133fad");
		// 初始化主账号名称和主账号令牌，登陆云通讯网站后，可在"控制台-应用"中看到开发者主账号ACCOUNT SID和
		// 主账号令牌AUTH TOKEN。
		restAPI.setAppId("8a48b5514fa577af014faab6c1400e60");
		// 初始化应用ID，如果是在沙盒环境开发，
		// 请配置"控制台-应用-测试DEMO"中的APPID。如切换到生产环境，请使用自己创建应用的APPID
		result = restAPI.voiceVerify(verifyCode, mobile, "", "3", "http://localhost:8080/genealogy/app/FsGetValidCode", 
				"", "", "", "");
		System.out.println("SDKTestVoiceVerify result=" + result);
		if ("000000".equals(result.get("statusCode"))) {
			// 正常返回输出data包体信息（map）
			@SuppressWarnings("unchecked")
			HashMap<String, Object> data = (HashMap<String, Object>) result.get("data");
			Set<String> keySet = data.keySet();
			for (String key : keySet) {
				Object object = data.get(key);
				System.out.println(key + " = " + object);
			}
		} else {
			// 异常返回输出错误码和错误信息
			System.out.println("错误码=" + result.get("statusCode") + " 错误信息= "
					+ result.get("statusMsg"));
		}
		return true;
	}

}
