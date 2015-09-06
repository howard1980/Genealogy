package com.maxiaohua.genealogy.fw.core.sms;

public interface SMSManager {
	boolean sendSMS(String mobile, String message);
}
