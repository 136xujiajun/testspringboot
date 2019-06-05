package com.Threads.threadState;

/**
 * 最后执行
 */
public class DaemonDemo {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true){
                    System.out.println(i++);
                }
            }
        });
        //当所有用户线程都结束了,就会结束守护线程
        t.setDaemon(true);
        t.start();
        System.out.println("00000000000000");

    }
}
