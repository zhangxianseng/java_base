package com.example.java_base.javaio;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zzq 2019/7/30 14:58
 * @description
 */
@Slf4j
public class ReadPathFile {
    // 请求总数
    public static int clientTotal = 5000;

    // 同时并发执行的线程数
    public static int threadTotal = 200;

    public static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) throws Exception {
    }

}
