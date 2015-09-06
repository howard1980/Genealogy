package com.maxiaohua.genealogy.fw.core.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QueryDAOImpl extends MyBatisDAOSupport implements com.maxiaohua.genealogy.fw.core.dao.QueryDAO {
	
	private static final String SQL_WHERE_CONDITION_KEYWORD = "_dynamicWhereCondition";
	
	private static final String SQL_WHERE_CONDITION_KEYWORD2 = "_dynamicWhereCondition2";
	
	private static final String SQL_ORDER_BY_CONDITION_KEYWORD = "_orderByCondition";
	
	private static final String SQL_FETCH_FIRST_CONDITION_KEYWORD = "_fetchFirstCondition";
	
	private static final String SQL_LIMIT_CONDITION_KEYWORD = "_limitCondition";
	
	private static final String SQL_OFFSET_CONDITION_KEYWORD = "_offsetCondition";

	
	@Override
	public <E> E queryForObject(
			String sqlId,
			Object params) {
		checkSqlID(sqlId);
		E result = getSqlSession().selectOne(sqlId, params);
		return result;
	}

	
	@Override
	public <E> List<E> queryForObjectList(
			String sqlId,
			Object params) {
		checkSqlID(sqlId);
		List<E> result = getSqlSession().selectList(sqlId, params);
		return result;
	}

	
	@Override
	public <E> int count(
			String sqlId,
			Object params) {
		checkSqlID(sqlId);
		int result = getSqlSession().selectOne(sqlId, params);
		return result;
	}

	
	@Override
	public <E> List<E> queryBySQL(
			String sqlId,
			String sqlWhere,
			String sqlOrderBy,
			String sqlFetchFirst,
			String sqlLimit,
			String sqlOffset) {
		checkSqlID(sqlId);

		

		Map<String, Object> conditionMap = new HashMap<String, Object>();
		if (sqlWhere != null) {
			conditionMap.put(SQL_WHERE_CONDITION_KEYWORD, sqlWhere);
		}
		if (sqlOrderBy != null) {
			conditionMap.put(SQL_ORDER_BY_CONDITION_KEYWORD, sqlOrderBy);
		}
		if (sqlFetchFirst != null) {
			conditionMap.put(SQL_FETCH_FIRST_CONDITION_KEYWORD, sqlFetchFirst);
		}
		if (sqlLimit != null) {
			conditionMap.put(SQL_LIMIT_CONDITION_KEYWORD, sqlLimit);
		}
		if (sqlOffset != null) {
			conditionMap.put(SQL_OFFSET_CONDITION_KEYWORD, sqlOffset);
		}
		
		List<E> result = getSqlSession().selectList(sqlId, conditionMap);
		return result;
	}

	@Override
	public <E> List<E> queryBySQL2(
			String sqlId,
			String sqlWhere,
			String sqlOrderBy,
			String sqlFetchFirst,
			String sqlLimit,
			String sqlOffset) {
		checkSqlID(sqlId);

		

		Map<String, Object> conditionMap = new HashMap<String, Object>();
		if (sqlWhere != null) {
			conditionMap.put(SQL_WHERE_CONDITION_KEYWORD2, sqlWhere);
		}
		if (sqlOrderBy != null) {
			conditionMap.put(SQL_ORDER_BY_CONDITION_KEYWORD, sqlOrderBy);
		}
		if (sqlFetchFirst != null) {
			conditionMap.put(SQL_FETCH_FIRST_CONDITION_KEYWORD, sqlFetchFirst);
		}
		if (sqlLimit != null) {
			conditionMap.put(SQL_LIMIT_CONDITION_KEYWORD, sqlLimit);
		}
		if (sqlOffset != null) {
			conditionMap.put(SQL_OFFSET_CONDITION_KEYWORD, sqlOffset);
		}
		
		List<E> result = getSqlSession().selectList(sqlId, conditionMap);
		return result;
	}
	
	public int countBySQL(
			String sqlId,
			String sqlWhere) {
		checkSqlID(sqlId);

		

		Map<String, Object> conditionMap = new HashMap<String, Object>();
		if (sqlWhere != null) {
			conditionMap.put(SQL_WHERE_CONDITION_KEYWORD, sqlWhere);
		}

		int result = getSqlSession().selectOne(sqlId, conditionMap);
		return result;
	}
	
	public int countBySQL2(
			String sqlId,
			String sqlWhere) {
		checkSqlID(sqlId);

		

		Map<String, Object> conditionMap = new HashMap<String, Object>();
		if (sqlWhere != null) {
			conditionMap.put(SQL_WHERE_CONDITION_KEYWORD2, sqlWhere);
		}

		int result = getSqlSession().selectOne(sqlId, conditionMap);
		return result;
	}
}