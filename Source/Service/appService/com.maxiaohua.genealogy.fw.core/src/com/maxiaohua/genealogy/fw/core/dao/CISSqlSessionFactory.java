package com.maxiaohua.genealogy.fw.core.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;


public interface CISSqlSessionFactory {
    
    static final String DEFAULT_CONFIG_PATH = "mybatis-config.xml";
    
    static final String DEFAULT_ENVIRONMENT_ID = "product";

    
    void load();

    
    Map<String, SqlSessionFactory> getSqlSessionFactories();

    
    SqlSessionFactory getDefaultSqlSessionFactory();

    
    SqlSessionFactory getSqlSessionFactory(
            String environmentId);
}