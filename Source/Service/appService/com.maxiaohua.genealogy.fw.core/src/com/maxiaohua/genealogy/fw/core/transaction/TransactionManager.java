package com.maxiaohua.genealogy.fw.core.transaction;


public interface TransactionManager {
    
    void begin();

    
    void commit();

    
    void rollback();
}