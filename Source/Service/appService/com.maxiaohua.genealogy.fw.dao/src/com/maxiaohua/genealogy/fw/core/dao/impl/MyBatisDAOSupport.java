package com.maxiaohua.genealogy.fw.core.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.dao.util.MyBatisConfigUtil;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;


abstract class MyBatisDAOSupport {
	
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();

	
	protected SqlSession getSqlSession() {
		RequestContext rc = RequestContext.open();
		Object sqlSession = rc.getElement(RequestContext.Key.SQLSession);
		if (sqlSession != null) {
			((SqlSession) sqlSession).clearCache();
		}
		return (SqlSession) sqlSession;
	}

	
	protected SqlSession getNewSqlSession() {
		RequestContext rc = RequestContext.open();
		String systemId = (String) rc.getElement(RequestContext.Key.SystemId);
		return MyBatisConfigUtil.getSqlSessionFactory(systemId).openSession();
	}

	
	protected void checkSqlID(
			String sqlID) {
		
	}
}