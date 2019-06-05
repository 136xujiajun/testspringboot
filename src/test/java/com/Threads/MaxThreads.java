package com.Threads;

import java.util.concurrent.CountDownLatch;

/**
 * 线程占用的是系统内存
 * 线程在Java中是一个对象,每一个Java线程都需要一个操作系统线程支持
 * Java对象占用对内存，操作系统线程占用系统内存，Jvm规定一个线程默认
 * 最大栈大小为1M，栈空间是需要从系统内存中分配的。
 *
 * Tomcat默认的线程池线程数量为200  网诺数据传输是阻塞的
 *
 * IO密集型设置 服务器核心的20到30倍。
 *
 * nio是非阻塞的。
 */
public class MaxThreads {

    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(1);

        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=0;i<5000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        cdl.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            System.out.println("i="+i);
        }


    }
}

