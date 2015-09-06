package com.maxiaohua.genealogy.fw.core.file;

import java.io.InputStream;
import java.util.List;


public interface FileReader {
    
    <E> List<E> read(
            InputStream fileInStream,
            Class<E> beanClazz);

    
    <E> List<E> read(
            InputStream fileInStream,
            Class<E> beanClazz,
            FileConfig fileConfig);
}