package com.maxiaohua.genealogy.fw.core.dao.mybatis.ex;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.transaction.Transaction;

import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.log.LogUtil;


public class SimpleExecutorEx extends SimpleExecutor {
	
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();

	
	public SimpleExecutorEx(
			Configuration configuration,
			Transaction transaction) {
		super(configuration, transaction);
	}

	
	public int doUpdate(
			MappedStatement ms,
			Object parameter) throws SQLException {
		Statement stmt = null;
		try {
			Configuration configuration = ms.getConfiguration();
			StatementHandler handler = configuration.newStatementHandler(this, ms, parameter, RowBounds.DEFAULT, null, null);
			stmt = prepareStatement(handler, ms.getStatementLog());

			if (handler.getBoundSql() != null) {
				debugLogger.writeDebugLog("SQLID:" + ms.getId());
				debugLogger.writeDebugLog("SQL�?:" + handler.getBoundSql().getSql());
				debugLogger.writeDebugLog("SQLのパラメータ:" + LogUtil.getParameter(handler.getBoundSql().getParameterObject()));
			}

			return handler.update(stmt);
		} finally {
			closeStatement(stmt);
		}
	}

	
	public <E> List<E> doQuery(
			MappedStatement ms,
			Object parameter,
			RowBounds rowBounds,
			ResultHandler resultHandler,
			BoundSql boundSql) throws SQLException {
		Statement stmt = null;
		try {
			Configuration configuration = ms.getConfiguration();
			StatementHandler handler = configuration.newStatementHandler(this, ms, parameter, rowBounds, resultHandler, boundSql);
			stmt = prepareStatement(handler, ms.getStatementLog());

			if (handler.getBoundSql() != null) {
				debugLogger.writeDebugLog("SQLID:" + ms.getId());
				debugLogger.writeDebugLog("SQL�?:" + handler.getBoundSql().getSql());
				debugLogger.writeDebugLog("SQLのパラメータ:" + LogUtil.getParameter(handler.getBoundSql().getParameterObject()));
			}

			return handler.<E> query(stmt, resultHandler);
		} finally {
			closeStatement(stmt);
		}
	}

	
	private Statement prepareStatement(
			StatementHandler handler,
			Log statementLog) throws SQLException {
		Statement stmt;
		Connection connection = getConnection(statementLog);
		stmt = handler.prepare(connection);
		handler.parameterize(stmt);
		return stmt;
	}
}