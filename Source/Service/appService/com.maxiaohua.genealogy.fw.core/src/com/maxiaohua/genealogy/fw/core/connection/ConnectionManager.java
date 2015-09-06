package com.maxiaohua.genealogy.fw.core.connection;

import org.apache.ibatis.session.SqlSession;


public interface ConnectionManager {

	
	SqlSession getConnection(
			boolean caughtExpectedException,
			String sysId) throws Exception;

	
	boolean checkStaleConnectionException(
			Throwable throwable) throws Exception;

}