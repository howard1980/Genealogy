package com.maxiaohua.genealogy.fw.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;


abstract public class FileUtil {
    
    private static final char DOT_CHR = '.';
    
    private static final String EMPTY = "";

    
    public static boolean removeDirs(
            File dir) {
        if (dir == null) {
            return false;
        }
        File[] files = dir.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    removeDirs(files[i]);
                } else {
                    files[i].delete();
                }
            }
        }
        return dir.delete();
    }

    
    public static void copyFile(
            String srcFile,
            String newFile) {

        checkAbsolutePath(srcFile);
        checkAbsolutePath(newFile);

        File srcFileObject = new File(srcFile);
        if (!srcFileObject.exists()) {
            throw new RuntimeException(srcFile + " is not exist.");
        }

        File newFileObject = new File(newFile);
        if (newFileObject.exists()) {
            deleteFile(newFile);
        } else if (newFileObject.exists()) {
            throw new RuntimeException(newFile + " is exist.");
        }

        FileOutputStream fos = null;
        FileChannel outputFileChannel = null;
        FileInputStream ios = null;
        FileChannel inputFileChannel = null;
        FileLock inputFileLock = null;
        FileLock outputFileLock = null;
        try {
            fos = new FileOutputStream(newFileObject, true);
            outputFileChannel = fos.getChannel();

            ios = new FileInputStream(srcFileObject);
            inputFileChannel = ios.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            inputFileLock = inputFileChannel.lock(0L, Long.MAX_VALUE, true);
            outputFileLock = outputFileChannel.lock(0L, Long.MAX_VALUE, false);

            while (inputFileChannel.position() < inputFileChannel.size()) {
                buffer.clear();
                inputFileChannel.read(buffer);
                buffer.flip();
                outputFileChannel.write(buffer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (inputFileLock != null) {
                    inputFileLock.release();
                }
                if (outputFileLock != null) {
                    outputFileLock.release();
                }

                if (ios != null) {
                    ios.close();
                }

                if (fos != null) {
                    fos.close();
                }

                if (outputFileChannel != null) {
                    outputFileChannel.close();
                }

                if (inputFileChannel != null) {
                    inputFileChannel.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    
    public static void deleteFile(
            String srcFile) {

        checkAbsolutePath(srcFile);

        File srcFileObject = new File(srcFile);

        if (!srcFileObject.exists()) {
            throw new RuntimeException(srcFile + " is not exist.");
        }

        boolean result = srcFileObject.delete();

        if (!result) {
            throw new RuntimeException("File control operation was failed.");
        }
    }

    
    public static void renameFile(
            String srcFile,
            String newFile) {

        checkAbsolutePath(srcFile);
        checkAbsolutePath(newFile);

        File srcFileObject = new File(srcFile);
        File newFileObject = new File(newFile);

        if (!srcFileObject.exists()) {
            throw new RuntimeException(srcFile + " is not exist.");
        }

        if (newFileObject.exists()) {
            deleteFile(newFile);
        } else if (newFileObject.exists()) {
            throw new RuntimeException(newFile + " is exist.");
        }

        boolean result = true;
        result = srcFileObject.renameTo(newFileObject);

        if (!result) {
            throw new RuntimeException("File control operation was failed.");
        }
    }

    
    public static void mergeFile(
            List<String> fileList,
            String newFile) {
        File newFileObject = new File(newFile);

        checkAbsolutePath(newFile);

        if (newFileObject.exists()) {
            deleteFile(newFile);
        } else if (newFileObject.exists()) {
            throw new RuntimeException(newFile + " is exist.");
        }

        FileOutputStream fos = null;
        FileChannel outputFileChannel = null;
        FileLock outputFileLock = null;

        try {
            fos = new FileOutputStream(newFileObject, true);
            outputFileChannel = fos.getChannel();
            outputFileLock = outputFileChannel.lock(0L, Long.MAX_VALUE, false);

            for (String srcFile : fileList) {

                checkAbsolutePath(srcFile);

                File srcFileObject = new File(srcFile);

                if (!srcFileObject.exists()) {
                    throw new RuntimeException(srcFile + " is not exist.");
                }

                FileInputStream fis = null;
                FileChannel inputFileChannel = null;
                FileLock inputFileLock = null;

                try {
                    fis = new FileInputStream(srcFileObject);
                    inputFileChannel = fis.getChannel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);

                    inputFileLock = inputFileChannel.lock(0L, Long.MAX_VALUE, true);

                    while (inputFileChannel.position() < inputFileChannel.size()) {
                        buffer.clear();
                        inputFileChannel.read(buffer);
                        buffer.flip();
                        outputFileChannel.write(buffer);
                    }
                } finally {
                    if (inputFileLock != null) {
                        inputFileLock.release();
                    }
                    if (fis != null) {
                        fis.close();
                    }
                    if (inputFileChannel != null) {
                        inputFileChannel.close();
                    }
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (outputFileLock != null) {
                    outputFileLock.release();
                }

                if (fos != null) {
                    fos.close();
                }

                if (outputFileChannel != null) {
                    outputFileChannel.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    
    private static void checkAbsolutePath(
            String filePath) {
        File file = new File(filePath);
        if (!file.isAbsolute()) {
            throw new RuntimeException("File path is not absolute.");
        }
    }

    
    public static String getExtension(
            String name) {
        int index = name.lastIndexOf(DOT_CHR);
        return (index < 0) ? EMPTY : name.substring(index);
    }
}