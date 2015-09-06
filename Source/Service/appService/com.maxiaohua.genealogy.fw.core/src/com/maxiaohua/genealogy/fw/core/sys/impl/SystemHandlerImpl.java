package com.maxiaohua.genealogy.fw.core.sys.impl;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.properties.impl.MessageUtil;
import com.maxiaohua.genealogy.fw.core.sys.SystemHandler;
import com.maxiaohua.genealogy.fw.core.transaction.TransactionManager;
import com.maxiaohua.genealogy.fw.core.type.AutoInject;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;


public class SystemHandlerImpl implements SystemHandler {

	
	@AutoInject(name = "transactionManager")
	private TransactionManager transactionManager;

	
	@Override
	public Date getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		java.util.Date date = DateUtil.parseToDate(
				DateUtil.dateToString(new java.sql.Date(calendar.getTimeInMillis()), DateUtil.FORMAT.YYYYMMDDHyphen), DateUtil.FORMAT.YYYYMMDDHyphen);
		return new java.sql.Date(date.getTime());

	}

	
	@Override
	public Time getCurrentTime() {
		return new java.sql.Time(System.currentTimeMillis());
	}

	
	@Override
	public Timestamp getCurrentTimestamp() {
		return new java.sql.Timestamp(System.currentTimeMillis());
	}

	
	@Override
	public Timestamp getServceStartTime() {
		return (java.sql.Timestamp) RequestContext.open().getElement(RequestContext.Key.ServiceStartTime);
	}

	
	@Override
	public String getUserId() {
		return (String) RequestContext.open().getElement(RequestContext.Key.UserId);
	}

	
	@Override
	public Date getDefaultDate() {
		return DateUtil.getDefaultDate();
	}

	
	@Override
	public Time getDefaultTime() {
		return DateUtil.getDefaultTime();
	}

	
	@Override
	public Date getMaxDate() {
		return DateUtil.getMaxDate();
	}

	
	@Override
	public Date getMinDate() {
		return DateUtil.getMinDate();
	}

	
	@Override
	public Timestamp getMaxTimestamp() {
		return DateUtil.getMaxTimestamp();
	}

	
	@Override
	public Timestamp getMinTimestamp() {
		return DateUtil.getMinTimestamp();
	}

	
	@Override
	public void setUserId(
			String userId) {
		RequestContext.open().putElementToSession(RequestContext.Key.UserId, userId);
	}

	
//	@Override
//	public String getWsNo() {
//		return (String) RequestContext.open().getElement(RequestContext.Key.WsNo);
//	}
//
//	
//	@Override
//	public void setWsNo(
//			String wsNo) {
//		RequestContext.open().putElementToSession(RequestContext.Key.WsNo, wsNo);
//	}

	
//	@Override
//	public String getIpAddress() {
//		return (String) RequestContext.open().getElement(RequestContext.Key.IpAddress);
//	}
//
//	
//	@Override
//	public void setIpAddress(
//			String ipAddress) {
//		RequestContext.open().putElementToSession(RequestContext.Key.IpAddress, ipAddress);
//	}

	
//	@Override
//	public String getHostName() {
//		return (String) RequestContext.open().getElement(RequestContext.Key.HostName);
//	}
//
//	
//	@Override
//	public void setHostName(
//			String hostName) {
//		RequestContext.open().putElementToSession(RequestContext.Key.HostName, hostName);
//	}

	
//	@Override
//	public String getSessionId() {
//		return (String) RequestContext.open().getElement(RequestContext.Key.HttpSessionId);
//	}

	
//	@Override
//	public Object getUserInfo() {
//		return RequestContext.open().getElement(RequestContext.Key.UserInfo);
//	}
//
//	
//	@Override
//	public void setUserInfo(
//			Object userInfo) {
//		RequestContext.open().putElementToSession(RequestContext.Key.UserInfo, userInfo);
//	}

	
	@Override
	public void beginTransaction() {
		transactionManager.begin();
	}

	
	@Override
	public void commitTransaction() {
		transactionManager.commit();
	}

	
	@Override
	public void rollbackTransaction() {
		transactionManager.rollback();
	}

	
//	@Override
//	public String getLoginId() {
//		return (String) RequestContext.open().getElement(RequestContext.Key.LoginId);
//	}
//
//	
//	@Override
//	public void setLoginId(
//			String loginId) {
//		RequestContext.open().putElementToSession(RequestContext.Key.LoginId, loginId);
//	}

	
	@Override
	public String getMessage(
			String messageId,
			Object... parameters) {
		return MessageUtil.getMessage(messageId, parameters);
	}
}