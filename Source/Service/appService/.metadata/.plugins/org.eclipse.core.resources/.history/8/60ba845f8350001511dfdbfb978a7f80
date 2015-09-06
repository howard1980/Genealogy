package com.maxiaohua.genealogy.fw.core.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.maxiaohua.genealogy.fw.core.exception.ApplicationException;


public class UpdateDAOImpl extends MyBatisDAOSupport implements com.maxiaohua.genealogy.fw.core.dao.UpdateDAO {

	
	private static final String FIND = "FIND";

	
	private static final String UNDER_BAR = "_";

	
	public <E> int update(
			String sqlId,
			E params) {
		checkSqlID(sqlId);
		int result = getSqlSession().update(sqlId, params);
		return result;
	}

	
	public <E> int updateOne(
			String sqlId,
			E params,
			String messageId,
			Object... messageParams) {
		int updResult = 0;
		try {
			
			updResult = update(sqlId, params);
		} catch (Throwable e) {
			throw new ApplicationException(e, messageId, messageParams);
		}
		if (updResult != 1) {
			
			throw new ApplicationException(messageId, messageParams);
		}
		return updResult;
	}

	
	public <E> int updateImmediately(
			String sqlId,
			E params) {
		checkSqlID(sqlId);

		SqlSession sqlSession = null;

		int result = 0;

		try {
			sqlSession = getNewSqlSession();
			
			result = sqlSession.update(sqlId, params);
			sqlSession.commit();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

		return result;
	}

	
	public <E> int updateOneImmediately(
			String sqlId,
			E params,
			String messageId,
			Object... messageParams) {
		int updResult = 0;
		try {
			
			updResult = updateImmediately(sqlId, params);
		} catch (Throwable e) {
			throw new ApplicationException(e, messageId, messageParams);
		}
		if (updResult != 1) {
			
			throw new ApplicationException(messageId, messageParams);
		}
		return updResult;
	}

	
	@Override
	public <E> E insertOneImmediatelyByCheckKey(
			String sqlId,
			E params,
			String messageId,
			Object... messageParams) {

		SqlSession sqlSession = null;

		E result = null;

		try {
			sqlSession = getNewSqlSession();
			String selectKey = sqlId.substring(0, sqlId.indexOf(UNDER_BAR) + 1);
			result = sqlSession.selectOne(selectKey + FIND, params);

			if (result == null) {
				updateOneImmediately(sqlId, params, messageId, messageParams);
			}
		} catch (Throwable e) {
			throw new ApplicationException(e, messageId, messageParams);
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

		return result;
	}

}