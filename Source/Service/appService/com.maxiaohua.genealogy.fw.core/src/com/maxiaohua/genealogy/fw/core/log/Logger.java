package com.maxiaohua.genealogy.fw.core.log;


public interface Logger {
	
	void debug(
			java.lang.Object message);

	
	void info(
			java.lang.Object message);

	
	void warn(
			java.lang.Object message);

	
	void warn(
			java.lang.Object message,
			java.lang.Throwable ex);

	
	void error(
			java.lang.Object message,
			java.lang.Throwable ex);

	
	void fatal(
			java.lang.Object message,
			java.lang.Throwable ex);

	
	void writeWSLog(
			Object... objs);
}