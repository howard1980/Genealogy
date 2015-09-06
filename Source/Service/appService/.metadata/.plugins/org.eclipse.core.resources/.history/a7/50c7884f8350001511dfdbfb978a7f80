package com.maxiaohua.genealogy.fw.core.dao.mybatis.ex;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;


public class SqlSessionFactoryBuilderEx extends SqlSessionFactoryBuilder {
    
    public SqlSessionFactory build(
            Configuration config) {
        
        Configuration configEx = new ConfigurationEx(config);
        return new DefaultSqlSessionFactory(configEx);
    }
}