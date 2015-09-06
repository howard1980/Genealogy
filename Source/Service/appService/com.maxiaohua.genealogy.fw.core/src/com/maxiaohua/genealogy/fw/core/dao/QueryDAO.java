package com.maxiaohua.genealogy.fw.core.dao;

import java.util.List;


public interface QueryDAO {

    
    <E> E queryForObject(
            String sqlId,
            Object params);

    
    <E> List<E> queryForObjectList(
            String sqlId,
            Object params);

    
    <E> int count(
            String sqlId,
            Object params);

    
    <E> int countBySQL(
            String sqlId,
            String sqlWhere);

    <E> int countBySQL2(
            String sqlId,
            String sqlWhere);
    
    <E> List<E> queryBySQL(
            String sqlId,
            String sqlWhere,
            String sqlOrderBy,
            String sqlFetchFirst,
            String sqlLimit,
            String sqlOffset);
    
    <E> List<E> queryBySQL2(
            String sqlId,
            String sqlWhere,
            String sqlOrderBy,
            String sqlFetchFirst,
            String sqlLimit,
            String sqlOffset); 
}