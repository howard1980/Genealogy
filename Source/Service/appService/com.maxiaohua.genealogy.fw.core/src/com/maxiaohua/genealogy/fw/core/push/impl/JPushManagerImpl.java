package com.maxiaohua.genealogy.fw.core.push.impl;

import java.util.Map;

import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

import com.google.gson.Gson;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.ErrorLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.Logger;
import com.maxiaohua.genealogy.fw.core.push.JPushManager;

public class JPushManagerImpl implements JPushManager {

	public static final Integer IMSI_ANDROID = 0;
	public static final Integer IMSI_IOS = 1;
	public static final Integer IMSI_WP = 2;
	
	protected static final Logger appLogger = LogFactory.getLogger();
	protected static final DebugLogger debugLogger = LogFactory
			.getDebugLogger();
	protected static final ErrorLogger errorLogger = LogFactory
			.getErrorLogger();

	private static final String APP_KEY = "d3f541a06bc02d5b978914cf";
	protected static final String SECRET_KEY = "27d9981a020a5df9a803337a";
	private static final JPushClient jpushClient = new JPushClient(SECRET_KEY,
			APP_KEY);

	private static final String APP_KEY_WORKER = "fa9cf7724f266b2633b3471f";
	protected static final String SECRET_KEY_WORKER = "3cda3f48eeb6d57997c37cee";
	private static final JPushClient jpushClientForService = new JPushClient(
			SECRET_KEY_WORKER, APP_KEY_WORKER);

	// private static final String ALIAS_PREFIX ;

	/**
	 * 发送jpush到工作端口
	 */
	@Override
	public boolean sendByRegisitrationIDToWorker(String msg,
			Map<String, String> extras, String... regisitrationIDs) {

		// PushPayload payload = PushPayload.newBuilder()
		// .setPlatform(Platform.all())
		// .setAudience(Audience.registrationId(regisitrationIDs))
		// .setNotification(Notification.newBuilder()
		// .addPlatformNotification(AndroidNotification.newBuilder()
		// .addExtra("orderID", orderID)
		// .build())
		// .build())
		// .setMessage(Message.content(msg))
		// .build();

		String extrasJson = new Gson().toJson(extras); 
		//extrasJson = extrasJson.replaceAll("\"", "'");
		
		PushPayload payload = PushPayload
				.newBuilder()
				.setPlatform(Platform.all())
				.setAudience(Audience.registrationId(regisitrationIDs))
				//.setNotification(Notification.ios(msg, extras)) //alert(msg)
				.setMessage(
						Message.newBuilder().setMsgContent(msg)
								.addExtra("data", extrasJson).build()).build();
		
		
		// PushPayload payload = PushPayload.newBuilder()
		// .setPlatform(Platform.all())
		// .setAudience(Audience.registrationId(regisitrationIDs))
		// .setNotification( Notification.android(msg, msg, extras)
		// //.ios(msg, extras)
		// Notification.alert("")
		// ).build();

		try {
			PushResult result = jpushClientForService.sendPush(payload);
			return result.isResultOK();
		} catch (Exception e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
			return false;
		}
	}

	/**
	 * 发送jpush到客户端
	 */
	@Override
	public boolean sendByRegisitrationID(String msg,Map<String, String> extras, Integer imsi, String... regisitrationIDs) {

		
		String extrasJson = new Gson().toJson(extras); 
		//extrasJson = extrasJson.replaceAll("\"", "'");
		PushPayload payload = null;
		if(imsi==IMSI_ANDROID){
			 payload = PushPayload.newBuilder()
					.setPlatform(Platform.all())
					.setAudience(Audience.registrationId(regisitrationIDs))
					.setMessage(
							Message.newBuilder().setMsgContent(msg)
									.addExtra("data",  extrasJson).build())
					.build();
		}
//		else if(imsi==IMSI_IOS){
//			 payload = PushPayload.newBuilder()
//					.setPlatform(Platform.all())
//					.setAudience(Audience.registrationId(regisitrationIDs))
//					.setNotification(Notification.ios(msg, extras)) //alert(msg)
//					.build();
//		}
		else{ //默认按iphone处理
			payload = PushPayload.newBuilder()
					.setPlatform(Platform.all())
					.setAudience(Audience.registrationId(regisitrationIDs))
					.setNotification(Notification.ios(msg, extras)) //alert(msg)
					.build();
		}
		
//		PushPayload payload = PushPayload
//				.newBuilder()
//				.setPlatform(Platform.all())
//				.setAudience(Audience.registrationId(regisitrationIDs))
//				.setMessage(
//						Message.newBuilder().setMsgContent(msg)
//								.addExtra("data",  extrasJson).build()).build();
		
//		
//		PushPayload payload = PushPayload.newBuilder()
//				.setPlatform(Platform.all())
//				.setAudience(Audience.registrationId(regisitrationIDs))
//				.setNotification(Notification.ios(msg, extras)) //alert(msg)
//				.setMessage(
//						Message.newBuilder().setMsgContent(msg)
//								.addExtra("data",  extrasJson).build())
//				.build();
		try {
			PushResult result = jpushClient.sendPush(payload);
			return result.isResultOK();
		} catch (Exception e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
			return false;
		}
	}

	@Override
	public boolean sendByTags(String msg, String... tags) {
		PushPayload payload = PushPayload.newBuilder()
				.setPlatform(Platform.all()).setAudience(Audience.tag(tags))
				.setNotification(Notification.alert(msg)).build();
		try {
			PushResult result = jpushClient.sendPush(payload);
			return result.isResultOK();
		} catch (Exception e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
			return false;
		}

	}

	@Override
	public boolean sendByAlias(String msg, String prefix, String... alias) {
		PushPayload payload = PushPayload.newBuilder()
				.setPlatform(Platform.all()).setAudience(Audience.alias(alias))
				.setNotification(Notification.alert(msg)).build();
		try {
			PushResult result = jpushClient.sendPush(payload);
			return result.isResultOK();
		} catch (Exception e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
			return false;
		}

	}

	@Override
	public boolean sendAll(String msg) {
		PushPayload payload = PushPayload.newBuilder()
				.setPlatform(Platform.all()).setAudience(Audience.all())
				.setNotification(Notification.alert(msg)).build();
		try {
			PushResult result = jpushClient.sendPush(payload);
			return result.isResultOK();
		} catch (Exception e1) {
			errorLogger.writeErrorLog(e1.getMessage());
			appLogger.error(e1.getMessage(), e1);
			debugLogger.error(e1.getMessage(), e1);
			return false;
		}

	}

}
