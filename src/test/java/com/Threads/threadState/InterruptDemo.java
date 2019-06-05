package com.Threads.threadState;

/**
 * Created by HP-8560p on 2018/9/5.
 */
public class InterruptDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i= 0;
                while (true){
                    System.out.println(i++);
                }

            }
        });

        t1.start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();
    }
}
