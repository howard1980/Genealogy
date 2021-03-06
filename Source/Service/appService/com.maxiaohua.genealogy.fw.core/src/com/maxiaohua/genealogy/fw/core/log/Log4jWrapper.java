package com.maxiaohua.genealogy.fw.core.log;


public class Log4jWrapper implements com.maxiaohua.genealogy.fw.core.log.Logger, DebugLogger, ErrorLogger {
	
	org.apache.log4j.Logger log;

	
	protected Log4jWrapper(
			org.apache.log4j.Logger log) {
		this.log = log;
	}

	
	@Override
	public void debug(
			Object message) {
		if (log.isDebugEnabled()) {
			String content = LogUtil.formatMessage(message);
			log.debug(content);
		}
	}

	
	@Override
	public void info(
			Object message) {
		if (log.isInfoEnabled()) {
			String content = LogUtil.formatMessage(message);
			log.info(content);
		}

	}

	
	@Override
	public void warn(
			Object message) {
		String content = LogUtil.formatMessage(message);
		log.warn(content);
	}

	
	@Override
	public void warn(
			Object message,
			Throwable ex) {
		String content = LogUtil.formatMessage(message);
		log.warn(content, ex);
	}

	
	@Override
	public void error(
			Object message,
			Throwable ex) {
		String content = LogUtil.formatMessage(message);
		log.error(content, ex);
	}

	
	@Override
	public void fatal(
			Object message,
			Throwable ex) {
		String content = LogUtil.formatMessage(message);
		log.fatal(content, ex);
	}

	
	@Override
	public void writeDebugLog(
			Object... objs) {
		if (objs != null) {
			for (Object obj : objs) {
				String content = LogUtil.formatMessage(obj);
				log.debug(content);
			}
		}
	}

	
	@Override
	public void writeWSLog(
			Object... objs) {
		if (objs != null) {
			for (Object obj : objs) {
				String content = LogUtil.formatMessage(obj);
				log.info(content);
			}
		}
	}

	
	@Override
	public void writeErrorLog(
			Object message) {
		String content = LogUtil.formatMessage(message);
		log.error(content);
	}

}