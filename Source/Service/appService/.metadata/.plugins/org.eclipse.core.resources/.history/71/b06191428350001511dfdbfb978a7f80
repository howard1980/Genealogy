package com.maxiaohua.genealogy.fw.core.transaction.impl;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.maxiaohua.genealogy.fw.core.context.RequestContext;
import com.maxiaohua.genealogy.fw.core.exception.SystemException;
import com.maxiaohua.genealogy.fw.core.transaction.TransactionManager;


public class TransactionManagerImpl implements TransactionManager {
    
    private TransactionFactory txFactory = new JdbcTransactionFactory();

    
    @Override
    public void begin() {
        
        RequestContext ctx = RequestContext.open();
        SqlSession session = (SqlSession) ctx.getElement(RequestContext.Key.SQLSession);

        
        Transaction transaction = txFactory.newTransaction(session.getConnection());
        ctx.putElement(RequestContext.Key.Transaction, transaction);
    }

    
    @Override
    public void commit() {
        try {
            RequestContext ctx = RequestContext.open();
            Transaction transaction = (Transaction) ctx.getElement(RequestContext.Key.Transaction);
            transaction.commit();
        } catch (SQLException e) {
            throw new SystemException(e);
        }
    }

    
    @Override
    public void rollback() {
        try {
            RequestContext ctx = RequestContext.open();
            Transaction transaction = (Transaction) ctx.getElement(RequestContext.Key.Transaction);
            transaction.rollback();
        } catch (SQLException e) {
            throw new SystemException(e);
        }
    }

}