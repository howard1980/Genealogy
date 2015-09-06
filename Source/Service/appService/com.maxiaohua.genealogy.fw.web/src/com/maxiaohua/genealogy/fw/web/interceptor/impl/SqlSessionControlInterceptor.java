package com.maxiaohua.genealogy.fw.web.interceptor.impl;

import org.apache.ibatis.session.SqlSession;

import com.maxiaohua.genealogy.fw.core.connection.ConnectionManager;
import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.dao.CISSqlSessionFactory;
import com.maxiaohua.genealogy.fw.core.interceptor.Interceptor;
import com.maxiaohua.genealogy.fw.core.interceptor.InterceptorChain;


public class SqlSessionControlInterceptor implements Interceptor {

	
	private ConnectionManager connectionManager;

	
	@Override
	public void intercept(
			InterceptorChain chain) throws Exception {
		RequestContext requestContext = RequestContext.open();
		SqlSession sqlSession = null;
		try {
//			HttpSession httpSession = chain.getRequest().getSession();
			String sysId = chain.getSysId();
//			if (sysId == null && httpSession != null) {
//				
//				sysId = (String) httpSession.getAttribute(RequestContext.Key.SystemId.toString());
//			}
			if (sysId == null) {
				sysId = CISSqlSessionFactory.DEFAULT_ENVIRONMENT_ID;
			}

			
			sqlSession = connectionManager.getConnection(chain.isCaughtExpectedException(), sysId);

			
			requestContext.putElement(RequestContext.Key.SQLSession, sqlSession);

			chain.next();
		} finally {
			
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}

	
	public void setConnectionManager(
			ConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}

}