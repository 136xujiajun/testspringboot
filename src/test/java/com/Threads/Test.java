package com.Threads;

import java.util.concurrent.locks.LockSupport;

/**
 * Created by HP-8560p on 2018/10/14.
 */
public class Test {


    static Thread thread = null;

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("等待");
                LockSupport.unpark(thread);
            }
        }).start();
        thread = Thread.currentThread();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("等待");
        LockSupport.park(thread);//wait
        System.out.println("sidfuaiouaiuf");
    }
}
