package com.Threads.threadState;

/**
 * 线程状态
 * <p/>
 * 1. 初始(NEW)：新创建了一个线程对象，但还没有调用start()方法。
 * 2. 运行(RUNNABLE)：Java线程中将就绪（ready）和运行中（running）两种状态笼统的称为“运行”。
 * 线程对象创建后，其他线程(比如main线程）调用了该对象的start()方法。该状态的线程位于可运行线程池中，等待被线程调度选中，获取CPU的使用权，此时处于就绪状态（ready）。就绪状态的线程在获得CPU时间片后变为运行中状态（running）。
 * 3.阻塞(BLOCKED)：表示线程阻塞于锁。
 * 4.等待(WAITING)：进入该状态的线程需要等待其他线程做出一些特定动作（通知或中断）。
 * 5.超时等待(TIMED_WAITING)：该状态不同于WAITING，它可以在指定的时间后自行返回。
 * 6. 终止(TERMINATED)：表示该线程已经执行完毕。
 */
public class ThreadStateDemo {

    private static volatile boolean DOING = true;

    public static void main(String[] args) {
        final Object lock = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (DOING) {
                    i++;
                }
                System.out.println(Thread.currentThread().getName() + "i = " + i);
                System.out.println(Thread.currentThread().getName() + "进入sleep");
                try {
                    Thread.sleep(30 * 1000L);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "从sleep 被中断");
                }
                System.out.println(Thread.currentThread().getName() + "从sleep被中断的状态：" +
                        Thread.currentThread().getState());
                synchronized (lock) {
                    try {
                        Thread.sleep(1 * 60 * 1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "执行完成");
            }
        });
        System.out.println(t1.getName() + "创建后的状态：" + t1.getState());
        t1.getState();
        System.out.println(t1.getName() + "调用start后的状态" + t1.getState());
        DOING = false;
        System.out.println(t1.getName() + "sleep 后的状态" + t1.getState());

        //中断t1
        t1.interrupt();

        System.out.println(t1.getName() + "现在的状态：" + t1.getState());

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "开始执行");

                synchronized (lock) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + "执行完成");

            }
        });
        t2.start();

        System.out.println(t2.getName() +"的状态："+ t2.getState());

        try {
            //当我们调用某个线程的这个方法时，这个方法会挂起调用线程，直到被调用线程结束执行，调用线程才会继续执行。
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t2.getName()+"的状态"+t2.getState());


    }


}
