package com.maxiaohua.genealogy.fw.core.dao.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;

import com.maxiaohua.genealogy.fw.core.bean.BeanFactory;
import com.maxiaohua.genealogy.fw.core.config.SystemContext;
import com.maxiaohua.genealogy.fw.core.dao.mybatis.ex.SqlSessionFactoryBuilderEx;
import com.maxiaohua.genealogy.fw.core.exception.ApplicationException;
import com.maxiaohua.genealogy.fw.core.message.MessageCode;


abstract public class MyBatisConfigUtil {
	
	private static final String DEFAULT_CONFIG_PATH = "mybatis-config.xml";

	
	public static final String DEFAULT_ENVIRONMENT_ID = "product";

	
	public static final String ENVIRONMENT_ID_NAME = "environmentIds";

	
	private static List<String> environmentIds = null;

	
	private static Map<String, SqlSessionFactory> sqlSessionFactories = null;
	static {
		InputStream[] inputStreams = null;
		try {
			
			BeanFactory beanFactory = SystemContext.getBeanFactory();
			environmentIds = beanFactory.beanOfName(ENVIRONMENT_ID_NAME);

			if (environmentIds == null) {
				environmentIds = new ArrayList<String>(0);
				environmentIds.add(DEFAULT_ENVIRONMENT_ID);
				inputStreams = new InputStream[1];
			} else {
				inputStreams = new InputStream[environmentIds.size()];
			}
			sqlSessionFactories = new HashMap<String, SqlSessionFactory>();
			int count = 0;
			for (String environmentId : environmentIds) {
				inputStreams[count] = Resources.getResourceAsStream(DEFAULT_CONFIG_PATH);
				
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilderEx().build(inputStreams[count], environmentId);

				if (sqlSessionFactory == null) {
					throw new RuntimeException("Fail in create myBatis SqlSessionFactory with " + DEFAULT_CONFIG_PATH);
				} else {
					sqlSessionFactories.put(environmentId, sqlSessionFactory);
				}
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStreams != null) {
					for (InputStream inputStream : inputStreams) {
						if (inputStream != null) {
							inputStream.close();
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	public static SqlSessionFactory[] getSqlSessionFactories() {
		return sqlSessionFactories.values().toArray(new SqlSessionFactory[0]);
	}

	
	public static SqlSessionFactory getDefaultSqlSessionFactory() {
		SqlSessionFactory sqlSessionFactory = sqlSessionFactories.get(DEFAULT_ENVIRONMENT_ID);
		if (sqlSessionFactory == null) {
			throw new RuntimeException("Fail in finding SqlSessionFactory with environment id: " + DEFAULT_ENVIRONMENT_ID);
		}
		return sqlSessionFactory;
	}

	
	public static SqlSessionFactory getSqlSessionFactory(
			String environmentId) {
		SqlSessionFactory sqlSessionFactory = sqlSessionFactories.get(environmentId);
		if (sqlSessionFactory == null) {
			
			throw new ApplicationException(MessageCode.M10170CM);
		}
		return sqlSessionFactory;
	}
}