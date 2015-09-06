package com.maxiaohua.genealogy.fw.core.connection.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;

import org.apache.ibatis.session.SqlSession;

import com.maxiaohua.genealogy.fw.core.connection.ConnectionManager;
import com.maxiaohua.genealogy.fw.core.dao.CISSqlSessionFactory;
import com.maxiaohua.genealogy.fw.core.log.DebugLogger;
import com.maxiaohua.genealogy.fw.core.log.LogFactory;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;


public class ConnectionManagerImpl implements ConnectionManager {
	
	protected static final DebugLogger debugLogger = LogFactory.getDebugLogger();

	
	private long retryTimeout;

	
	private boolean retryTimeoutFlag;

	
	private int retryCount;

	
	private boolean retryCountFlag;

	
	private boolean validFlg;

	
	private String targetException;

	
	private String validationQuery;

	
	private CISSqlSessionFactory cisSqlSessionFactory;

	@Override
	public SqlSession getConnection(
			boolean caughtExpectedException,
			String sysId) throws Exception {
		SqlSession sqlSession = null;
		if (this.validFlg && !caughtExpectedException) {
			sqlSession = getValidConnection(sysId);
		} else if (caughtExpectedException) {
			sqlSession = getValidConnection(sysId);
		} else {
			sqlSession = cisSqlSessionFactory.getSqlSessionFactory(sysId).openSession();
		}

		return sqlSession;
	}

	@Override
	public boolean checkStaleConnectionException(
			Throwable throwable) throws Exception {
		if (targetException != null) {
			if (Class.forName(this.targetException).isInstance(throwable)) {
				return true;
			} else {
				Throwable exception = throwable.getCause();
				try {
					if (exception != null) {
						if (Class.forName(this.targetException).isInstance(exception)) {
							return true;
						} else if (exception.equals(exception.getCause())) {
							return false;
						} else {
							return checkStaleConnectionException(exception.getCause());
						}
					} else {
						return false;
					}
				} catch (ClassNotFoundException e) {
					debugLogger.error("Target Exception is not found", e);
					return false;
				}
			}
		} else {
			return false;
		}

	}

	
	private SqlSession getValidConnection(
			String sysId) throws Exception {
		SqlSession sqlSession = null;
		Timestamp beginTime = null;
		boolean invalidFlag = true;
		if (this.retryTimeoutFlag) {
			beginTime = new Timestamp(Calendar.getInstance().getTimeInMillis());
		}

		if (this.retryCountFlag) {
			for (int i = 0; i < this.retryCount; i++) {
				Timestamp time = new Timestamp(Calendar.getInstance().getTimeInMillis());
				if (this.retryTimeoutFlag && this.retryTimeout <= ((time.getTime() - beginTime.getTime()) / 1000)) {
					Exception exception = (Exception) Class.forName(targetException).newInstance();
					throw exception;
				}

				sqlSession = cisSqlSessionFactory.getSqlSessionFactory(sysId).openSession();
				if (checkConnection(sqlSession)) {
					invalidFlag = false;
					break;
				}

			}
		} else {
			while (this.retryTimeoutFlag) {
				Timestamp time = new Timestamp(Calendar.getInstance().getTimeInMillis());
				if (this.retryTimeout <= ((time.getTime() - beginTime.getTime()) / 1000)) {
					Exception exception = (Exception) Class.forName(targetException).newInstance();
					throw exception;
				}

				sqlSession = cisSqlSessionFactory.getSqlSessionFactory(sysId).openSession();
				if (checkConnection(sqlSession)) {
					invalidFlag = false;
					break;
				}

			}
		}

		if (invalidFlag && (this.retryTimeoutFlag || this.retryCountFlag)) {
			Exception exception = (Exception) Class.forName(targetException).newInstance();
			throw exception;
		} else if (!this.retryTimeoutFlag && !this.retryCountFlag) {
			sqlSession = cisSqlSessionFactory.getSqlSessionFactory(sysId).openSession();
		}

		return sqlSession;

	}

	
	private boolean checkConnection(
			SqlSession sqlSession) {
		boolean result = false;
		if (sqlSession != null) {
			try {
				if (StringUtil.isNotEmpty(this.validationQuery)) {
					Connection connection = sqlSession.getConnection();
					PreparedStatement preparedStatement = connection.prepareStatement(this.validationQuery);
					if (preparedStatement.execute()) {
						result = true;
					}
				} else if (sqlSession.getConnection().isValid(0)) {
					result = true;
				}
			} catch (SQLException e) {
				sqlSession.close();
			}
		}

		return result;
	}

	
	public void setRetryTimeout(
			long retryTimeout) {
		this.retryTimeout = retryTimeout;
		if (retryTimeout > 0) {
			this.retryTimeoutFlag = true;
		}

	}

	
	public void setRetryCount(
			int retryCount) {
		this.retryCount = retryCount;
		if (retryCount > 0) {
			this.retryCountFlag = true;
		}
	}

	
	public void setValidFlg(
			boolean validFlg) {
		this.validFlg = validFlg;
	}

	
	public void setTargetException(
			String targetException) {
		this.targetException = targetException;
	}

	
	public void setValidationQuery(
			String validationQuery) {
		this.validationQuery = validationQuery;
	}

	
	public void setCisSqlSessionFactory(
			CISSqlSessionFactory cisSqlSessionFactory) {
		this.cisSqlSessionFactory = cisSqlSessionFactory;
	}

}