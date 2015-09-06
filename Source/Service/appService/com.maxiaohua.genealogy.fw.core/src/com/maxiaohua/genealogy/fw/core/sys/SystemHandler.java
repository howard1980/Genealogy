package com.maxiaohua.genealogy.fw.core.sys;



public interface SystemHandler {
	
	java.sql.Date getCurrentDate();

	
	java.sql.Time getCurrentTime();

	
	java.sql.Timestamp getCurrentTimestamp();

	
	java.sql.Timestamp getServceStartTime();

	
	String getUserId();

	
	void setUserId(
			String userId);

	
	java.sql.Date getDefaultDate();

	
	java.sql.Time getDefaultTime();

	
	java.sql.Date getMaxDate();

	
	java.sql.Date getMinDate();

	
	java.sql.Timestamp getMaxTimestamp();

	
	java.sql.Timestamp getMinTimestamp();

	
//	String getWsNo();
//
//	
//	void setWsNo(
//			String wsNo);

	
//	String getIpAddress();
//
//	
//	void setIpAddress(
//			String ipAddress);

	
//	String getHostName();
//
//	
//	void setHostName(
//			String hostName);

	
//	String getSessionId();

	
//	Object getUserInfo();
//
//	
//	void setUserInfo(
//			Object userInfo);
//	
	
//	String getLoginId();
//
//	
//	void setLoginId(
//			String loginId);
	
	void beginTransaction();

	
	void commitTransaction();

	
	void rollbackTransaction();

	
	String getMessage(
			String messageId,
			Object... parameters);

}