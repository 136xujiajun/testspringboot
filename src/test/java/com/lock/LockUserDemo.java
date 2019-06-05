package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class LockUserDemo {

    public static boolean going = true;

    private static int count;

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        Runnable task = new Runnable() {

            @Override
            public void run() {
                while (going) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    lock.lock();
                    System.out.println(Thread.currentThread().getName() + ": " + (++count));

                }

                System.out.println(Thread.currentThread().getName() + "退出,count值为：" + count);
            }
        };


    }

}
