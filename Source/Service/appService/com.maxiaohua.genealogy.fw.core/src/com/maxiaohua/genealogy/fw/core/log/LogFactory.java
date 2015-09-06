package com.maxiaohua.genealogy.fw.core.log;


public class LogFactory {
	
	private static Logger appLogger = new Log4jWrapper(org.apache.log4j.Logger.getLogger("applog"));
	
	private static DebugLogger debugLogger = new Log4jWrapper(org.apache.log4j.Logger.getLogger("debuglog"));
	
	private static ErrorLogger errorLogger = new Log4jWrapper(org.apache.log4j.Logger.getLogger("errorlog"));

	
	public static Logger getLogger() {
		return appLogger;
	}

	
	public static DebugLogger getDebugLogger() {
		return debugLogger;
	}

	
	public static ErrorLogger getErrorLogger() {
		return errorLogger;
	}
}