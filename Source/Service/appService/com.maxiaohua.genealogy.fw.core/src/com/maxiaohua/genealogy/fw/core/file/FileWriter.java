package com.maxiaohua.genealogy.fw.core.file;

import java.io.OutputStream;
import java.util.List;


public interface FileWriter {
    
    <E> void write(
            OutputStream fileOutStream,
            List<E> beanList) throws FileAccessException;

    
    <E> void write(
            OutputStream fileOutStream,
            List<E> beanList,
            FileConfig fileConfig) throws FileAccessException;

}