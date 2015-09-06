package com.maxiaohua.genealogy.fw.core.dao.mybatis.ex;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;

import com.maxiaohua.genealogy.fw.core.dao.CISSqlSessionFactory;
import com.maxiaohua.genealogy.fw.core.exception.ApplicationException;
import com.maxiaohua.genealogy.fw.core.message.MessageCode;
import com.maxiaohua.genealogy.fw.core.util.StringUtil;


public class CISSqlSessionFactoryImpl implements CISSqlSessionFactory {
    
    private String configFileName = null;
    
    private List<String> environmentIds = null;
    
    private Map<String, SqlSessionFactory> sqlSessionFactories = null;

    
    public void load() {
        InputStream[] inputStreams = null;
        if (environmentIds == null) {
            environmentIds = new ArrayList<String>(0);
            environmentIds.add(DEFAULT_ENVIRONMENT_ID);
            inputStreams = new InputStream[1];
        } else if (environmentIds.isEmpty()) {
            environmentIds.add(DEFAULT_ENVIRONMENT_ID);
            inputStreams = new InputStream[1];
        } else {
            inputStreams = new InputStream[environmentIds.size()];
        }

        if (StringUtil.isEmpty(configFileName)) {
            configFileName = DEFAULT_CONFIG_PATH;
        }

        try {
            
            sqlSessionFactories = new HashMap<String, SqlSessionFactory>();
            SqlSessionFactory sqlSessionFactory = null;
            String environmentId = null;
            for (int i = 0; i < environmentIds.size(); i++) {
                environmentId = environmentIds.get(i);
                inputStreams[i] = Resources.getResourceAsStream(configFileName);
                sqlSessionFactory = new SqlSessionFactoryBuilderEx().build(inputStreams[i], environmentId);
                if (sqlSessionFactory == null) {
                    throw new RuntimeException("Fail in create myBatis SqlSessionFactory with " + configFileName);
                } else {
                    putSqlSessionFactory(environmentId, sqlSessionFactory);
                }
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

    
    public SqlSessionFactory getDefaultSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = sqlSessionFactories.get(DEFAULT_ENVIRONMENT_ID);
        if (sqlSessionFactory == null) {
            throw new RuntimeException("Fail in finding SqlSessionFactory with environment id: " + DEFAULT_ENVIRONMENT_ID);
        }
        return sqlSessionFactory;
    }

    
    public SqlSessionFactory getSqlSessionFactory(
            String environmentId) {
        SqlSessionFactory sqlSessionFactory = sqlSessionFactories.get(environmentId);
        if (sqlSessionFactory == null) {
            throw new ApplicationException(MessageCode.M10170CM); 
        }
        return sqlSessionFactory;
    }

    public String getConfigFileName() {
        return configFileName;
    }

    public void setConfigFileName(
            String configFileName) {
        this.configFileName = configFileName;
    }

    public List<String> getEnvironmentIds() {
        return environmentIds;
    }

    public void setEnvironmentIds(
            List<String> environmentIds) {
        this.environmentIds = environmentIds;
    }

    public Map<String, SqlSessionFactory> getSqlSessionFactories() {
        return sqlSessionFactories;
    }

    public void setSqlSessionFactories(
            Map<String, SqlSessionFactory> sqlSessionFactories) {
        this.sqlSessionFactories = sqlSessionFactories;
    }

    public void putSqlSessionFactory(
            String environmentId,
            SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactories.put(environmentId, sqlSessionFactory);
    }
}