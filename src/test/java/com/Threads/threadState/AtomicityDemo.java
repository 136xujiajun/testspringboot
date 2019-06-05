package com.Threads.threadState;

import java.util.concurrent.CountDownLatch;

/**
 * Created by HP-8560p on 2018/9/6.
 */
public class AtomicityDemo {

    static volatile int count = 0;

    public static void increase(){
        count++;
    }

    public static void main(String[] args) {
        int threads = 20;
        CountDownLatch cd1  = new CountDownLatch(threads);
        for (int i= 0;i<threads; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<1000;i++){
                        AtomicityDemo.increase();
                    }
                    cd1.countDown();
                }
            }).start();
        }
        try {
            cd1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(AtomicityDemo.count);
    }

}
