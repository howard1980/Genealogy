package com.maxiaohua.genealogy.fw.core.dao.mybatis.ex;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.ibatis.builder.CacheRefResolver;
import org.apache.ibatis.builder.ResultMapResolver;
import org.apache.ibatis.builder.xml.XMLStatementBuilder;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.executor.BatchExecutor;
import org.apache.ibatis.executor.CachingExecutor;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.ReuseExecutor;
import org.apache.ibatis.executor.keygen.KeyGenerator;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMap;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.LocalCacheScope;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeAliasRegistry;
import org.apache.ibatis.type.TypeHandlerRegistry;


public class ConfigurationEx extends Configuration {
    
    private Configuration configuration;

    
    public ConfigurationEx(
            Configuration configuration) {
        this.configuration = configuration;
    }

    
    @Override
    public Executor newExecutor(
            Transaction transaction,
            ExecutorType executorType,
            boolean autoCommit) {
        executorType = executorType == null ? defaultExecutorType : executorType;
        executorType = executorType == null ? ExecutorType.SIMPLE : executorType;
        Executor executor;
        if (ExecutorType.BATCH == executorType) {
            executor = new BatchExecutor(this, transaction);
        } else if (ExecutorType.REUSE == executorType) {
            executor = new ReuseExecutor(this, transaction);
        } else {
            executor = new SimpleExecutorEx(this, transaction);
        }
        if (cacheEnabled) {
            executor = new CachingExecutor(executor, autoCommit);
        }
        executor = (Executor) interceptorChain.pluginAll(executor);
        return executor;
    }

    
    public String getDatabaseId() {
        return configuration.getDatabaseId();
    }

    
    public void setDatabaseId(
            String databaseId) {
        configuration.setDatabaseId(databaseId);
    }

    
    public boolean isSafeResultHandlerEnabled() {
        return configuration.isSafeResultHandlerEnabled();
    }

    
    public void setSafeResultHandlerEnabled(
            boolean safeResultHandlerEnabled) {
        configuration.setSafeResultHandlerEnabled(safeResultHandlerEnabled);
    }

    
    public boolean isSafeRowBoundsEnabled() {
        return configuration.isSafeRowBoundsEnabled();
    }

    
    public void setSafeRowBoundsEnabled(
            boolean safeRowBoundsEnabled) {
        configuration.setSafeRowBoundsEnabled(safeRowBoundsEnabled);
    }

    
    public boolean isMapUnderscoreToCamelCase() {
        return configuration.isMapUnderscoreToCamelCase();
    }

    
    public void setMapUnderscoreToCamelCase(
            boolean mapUnderscoreToCamelCase) {
        configuration.setMapUnderscoreToCamelCase(mapUnderscoreToCamelCase);
    }

    
    public void addLoadedResource(
            String resource) {
        configuration.addLoadedResource(resource);
    }

    
    public boolean isResourceLoaded(
            String resource) {
        return configuration.isResourceLoaded(resource);
    }

    
    public Environment getEnvironment() {
        return configuration.getEnvironment();
    }

    
    public void setEnvironment(
            Environment environment) {
        configuration.setEnvironment(environment);
    }

    
    public AutoMappingBehavior getAutoMappingBehavior() {
        return configuration.getAutoMappingBehavior();
    }

    
    public void setAutoMappingBehavior(
            AutoMappingBehavior autoMappingBehavior) {
        configuration.setAutoMappingBehavior(autoMappingBehavior);
    }

    
    public boolean isLazyLoadingEnabled() {
        return configuration.isLazyLoadingEnabled();
    }

    
    public void setLazyLoadingEnabled(
            boolean lazyLoadingEnabled) {
        configuration.setLazyLoadingEnabled(lazyLoadingEnabled);
    }

    
    public boolean isAggressiveLazyLoading() {
        return configuration.isAggressiveLazyLoading();
    }

    
    public void setAggressiveLazyLoading(
            boolean aggressiveLazyLoading) {
        configuration.setAggressiveLazyLoading(aggressiveLazyLoading);
    }

    
    public boolean isMultipleResultSetsEnabled() {
        return configuration.isMultipleResultSetsEnabled();
    }

    
    public void setMultipleResultSetsEnabled(
            boolean multipleResultSetsEnabled) {
        configuration.setMultipleResultSetsEnabled(multipleResultSetsEnabled);
    }

    
    public Set<String> getLazyLoadTriggerMethods() {
        return configuration.getLazyLoadTriggerMethods();
    }

    
    public void setLazyLoadTriggerMethods(
            Set<String> lazyLoadTriggerMethods) {
        configuration.setLazyLoadTriggerMethods(lazyLoadTriggerMethods);
    }

    
    public boolean isUseGeneratedKeys() {
        return configuration.isUseGeneratedKeys();
    }

    
    public void setUseGeneratedKeys(
            boolean useGeneratedKeys) {
        configuration.setUseGeneratedKeys(useGeneratedKeys);
    }

    
    public ExecutorType getDefaultExecutorType() {
        return configuration.getDefaultExecutorType();
    }

    
    public void setDefaultExecutorType(
            ExecutorType defaultExecutorType) {
        configuration.setDefaultExecutorType(defaultExecutorType);
    }

    
    public boolean isCacheEnabled() {
        return configuration.isCacheEnabled();
    }

    
    public void setCacheEnabled(
            boolean cacheEnabled) {
        configuration.setCacheEnabled(cacheEnabled);
    }

    
    public Integer getDefaultStatementTimeout() {
        return configuration.getDefaultStatementTimeout();
    }

    
    public void setDefaultStatementTimeout(
            Integer defaultStatementTimeout) {
        configuration.setDefaultStatementTimeout(defaultStatementTimeout);
    }

    
    public boolean isUseColumnLabel() {
        return configuration.isUseColumnLabel();
    }

    
    public void setUseColumnLabel(
            boolean useColumnLabel) {
        configuration.setUseColumnLabel(useColumnLabel);
    }

    
    public LocalCacheScope getLocalCacheScope() {
        return configuration.getLocalCacheScope();
    }

    
    public void setLocalCacheScope(
            LocalCacheScope localCacheScope) {
        configuration.setLocalCacheScope(localCacheScope);
    }

    
    public JdbcType getJdbcTypeForNull() {
        return configuration.getJdbcTypeForNull();
    }

    
    public void setJdbcTypeForNull(
            JdbcType jdbcTypeForNull) {
        configuration.setJdbcTypeForNull(jdbcTypeForNull);
    }

    
    public Properties getVariables() {
        return configuration.getVariables();
    }

    
    public void setVariables(
            Properties variables) {
        configuration.setVariables(variables);
    }

    
    public TypeHandlerRegistry getTypeHandlerRegistry() {
        return configuration.getTypeHandlerRegistry();
    }

    
    public TypeAliasRegistry getTypeAliasRegistry() {
        return configuration.getTypeAliasRegistry();
    }

    
    public ObjectFactory getObjectFactory() {
        return configuration.getObjectFactory();
    }

    
    public void setObjectFactory(
            ObjectFactory objectFactory) {
        configuration.setObjectFactory(objectFactory);
    }

    
    public ObjectWrapperFactory getObjectWrapperFactory() {
        return configuration.getObjectWrapperFactory();
    }

    
    public void setObjectWrapperFactory(
            ObjectWrapperFactory objectWrapperFactory) {
        configuration.setObjectWrapperFactory(objectWrapperFactory);
    }

    
    public MetaObject newMetaObject(
            Object object) {
        return configuration.newMetaObject(object);
    }

    
    public ParameterHandler newParameterHandler(
            MappedStatement mappedStatement,
            Object parameterObject,
            BoundSql boundSql) {
        return configuration.newParameterHandler(mappedStatement, parameterObject, boundSql);
    }

    
    public ResultSetHandler newResultSetHandler(
            Executor executor,
            MappedStatement mappedStatement,
            RowBounds rowBounds,
            ParameterHandler parameterHandler,
            ResultHandler resultHandler,
            BoundSql boundSql) {
        return configuration.newResultSetHandler(executor, mappedStatement, rowBounds, parameterHandler, resultHandler, boundSql);
    }

    
    public StatementHandler newStatementHandler(
            Executor executor,
            MappedStatement mappedStatement,
            Object parameterObject,
            RowBounds rowBounds,
            ResultHandler resultHandler,
            BoundSql boundSql) {
        return configuration.newStatementHandler(executor, mappedStatement, parameterObject, rowBounds, resultHandler, boundSql);
    }

    
    public Executor newExecutor(
            Transaction transaction) {
        return configuration.newExecutor(transaction);
    }

    
    public Executor newExecutor(
            Transaction transaction,
            ExecutorType executorType) {
        return configuration.newExecutor(transaction, executorType);
    }

    
    public void addKeyGenerator(
            String id,
            KeyGenerator keyGenerator) {
        configuration.addKeyGenerator(id, keyGenerator);
    }

    
    public Collection<String> getKeyGeneratorNames() {
        return configuration.getKeyGeneratorNames();
    }

    
    public Collection<KeyGenerator> getKeyGenerators() {
        return configuration.getKeyGenerators();
    }

    
    public KeyGenerator getKeyGenerator(
            String id) {
        return configuration.getKeyGenerator(id);
    }

    
    public boolean hasKeyGenerator(
            String id) {
        return configuration.hasKeyGenerator(id);
    }

    
    public void addCache(
            Cache cache) {
        configuration.addCache(cache);
    }

    
    public Collection<String> getCacheNames() {
        return configuration.getCacheNames();
    }

    
    public Collection<Cache> getCaches() {
        return configuration.getCaches();
    }

    
    public Cache getCache(
            String id) {
        return configuration.getCache(id);
    }

    
    public boolean hasCache(
            String id) {
        return configuration.hasCache(id);
    }

    
    public void addResultMap(
            ResultMap rm) {
        configuration.addResultMap(rm);
    }

    
    public Collection<String> getResultMapNames() {
        return configuration.getResultMapNames();
    }

    
    public Collection<ResultMap> getResultMaps() {
        return configuration.getResultMaps();
    }

    
    public ResultMap getResultMap(
            String id) {
        return configuration.getResultMap(id);
    }

    
    public boolean hasResultMap(
            String id) {
        return configuration.hasResultMap(id);
    }

    
    public void addParameterMap(
            ParameterMap pm) {
        configuration.addParameterMap(pm);
    }

    
    public Collection<String> getParameterMapNames() {
        return configuration.getParameterMapNames();
    }

    
    public Collection<ParameterMap> getParameterMaps() {
        return configuration.getParameterMaps();
    }

    
    public ParameterMap getParameterMap(
            String id) {
        return configuration.getParameterMap(id);
    }

    
    public boolean hasParameterMap(
            String id) {
        return configuration.hasParameterMap(id);
    }

    
    public void addMappedStatement(
            MappedStatement ms) {
        configuration.addMappedStatement(ms);
    }

    
    public Collection<String> getMappedStatementNames() {
        return configuration.getMappedStatementNames();
    }

    
    public Collection<MappedStatement> getMappedStatements() {
        return configuration.getMappedStatements();
    }

    
    public Collection<XMLStatementBuilder> getIncompleteStatements() {
        return configuration.getIncompleteStatements();
    }

    
    public void addIncompleteStatement(
            XMLStatementBuilder incompleteStatement) {
        configuration.addIncompleteStatement(incompleteStatement);
    }

    
    public Collection<CacheRefResolver> getIncompleteCacheRefs() {
        return configuration.getIncompleteCacheRefs();
    }

    
    public void addIncompleteCacheRef(
            CacheRefResolver incompleteCacheRef) {
        configuration.addIncompleteCacheRef(incompleteCacheRef);
    }

    
    public Collection<ResultMapResolver> getIncompleteResultMaps() {
        return configuration.getIncompleteResultMaps();
    }

    
    public void addIncompleteResultMap(
            ResultMapResolver resultMapResolver) {
        configuration.addIncompleteResultMap(resultMapResolver);
    }

    
    public MappedStatement getMappedStatement(
            String id) {
        return configuration.getMappedStatement(id);
    }

    
    public MappedStatement getMappedStatement(
            String id,
            boolean validateIncompleteStatements) {
        return configuration.getMappedStatement(id, validateIncompleteStatements);
    }

    
    public Map<String, XNode> getSqlFragments() {
        return configuration.getSqlFragments();
    }

    
    public void addInterceptor(
            Interceptor interceptor) {
        configuration.addInterceptor(interceptor);
    }

    
    public void addMappers(
            String packageName,
            Class<?> superType) {
        configuration.addMappers(packageName, superType);
    }

    
    public void addMappers(
            String packageName) {
        configuration.addMappers(packageName);
    }

    
    public <T> void addMapper(
            Class<T> type) {
        configuration.addMapper(type);
    }

    
    public <T> T getMapper(
            Class<T> type,
            SqlSession sqlSession) {
        return configuration.getMapper(type, sqlSession);
    }

    
    public boolean hasMapper(
            Class<?> type) {
        return configuration.hasMapper(type);
    }

    
    public boolean hasStatement(
            String statementName) {
        return configuration.hasStatement(statementName);
    }

    
    public boolean hasStatement(
            String statementName,
            boolean validateIncompleteStatements) {
        return configuration.hasStatement(statementName, validateIncompleteStatements);
    }

    
    public void addCacheRef(
            String namespace,
            String referencedNamespace) {
        configuration.addCacheRef(namespace, referencedNamespace);
    }

}