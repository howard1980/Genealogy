package com.maxiaohua.genealogy.fw.core.dao.util;


public class ThreadCallStackUtil {
    
    public static String getInvokedMethod(
            int layer) {
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        if (stacks.length > layer) {
            return stacks[layer].getClassName() + "." + stacks[layer].getMethodName();
        }
        return null;
    }

    
    public static String getInvokedClass(
            int layer) {
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        if (stacks.length > layer) {
            return stacks[layer].getClassName();
        }
        return null;
    }

    
    public static String getInvokedClassPackage(
            int layer) {
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        if (stacks.length > layer) {
            String clazzName = stacks[layer].getClassName();
            return clazzName.substring(0, clazzName.lastIndexOf("."));
        }
        return null;
    }

}