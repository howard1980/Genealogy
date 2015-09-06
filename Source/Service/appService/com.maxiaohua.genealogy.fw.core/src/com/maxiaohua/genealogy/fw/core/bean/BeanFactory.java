package com.maxiaohua.genealogy.fw.core.bean;


public interface BeanFactory {

    
    <T> T beanOfName(
            String beanName) throws Exception;

    
    <T> T beanOfType(
            Class<T> beanClazz) throws Exception;

    
    <T> void putBean(
            String beanName,
            T beanInstance) throws Exception;

    
    <T> T getBean(
            String beanName) throws Exception;

    
    <T> void removeBean(
            String beanName) throws Exception;
}