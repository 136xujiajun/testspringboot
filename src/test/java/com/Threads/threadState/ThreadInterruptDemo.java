package com.Threads.threadState;

import java.util.concurrent.locks.LockSupport;

/**
 * Created by HP-8560p on 2018/9/5.
 */
public class ThreadInterruptDemo {

    static volatile boolean DOING = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {

                System.out.println(Thread.currentThread().getName() + "进入sleep");

                try {
                    Thread.sleep(5 * 60 * 1000L);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "从sleep白中断");
                }

                //这个循环是用来等待外面的获取中断状态 完成再里在内部获取中断状态
                int i = 0;
                System.out.println(Thread.currentThread().getName() + "进入++循环");
                while (DOING) {
                    i++;
                }

                System.out.println(Thread.currentThread().getName() + "从++循环出来");
                System.out.println(Thread.currentThread().getName() +
                        "内部通过Thread.interrupted获取中断状态：" + Thread.interrupted());

                //这个循环是用来等待外边的代码完后,在进入下面的park
                System.out.println(Thread.currentThread().getName() + "进入++循环");

                while (!DOING) {
                    i++;
                }
                System.out.println(Thread.currentThread().getName() + "从++循环中出来");

                System.out.println(Thread.currentThread().getName() + "进入park阻塞");
                //进入到阻塞
                LockSupport.park();
                System.out.println(Thread.currentThread().getName() + "进入park出来");

                System.out.println(Thread.currentThread().getName() + "进入++循环");

                while (DOING) {
                    i++;
                }
                System.out.println(Thread.currentThread().getName() + "从++循环出来");
                System.out.println(Thread.currentThread().getName() +
                        "内部通过Thread.interrupted获取中断状态：" + Thread.interrupted());

                try {
                    Thread.sleep(5 * 60 * 1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();

        //中断t1
        t1.interrupt();
        System.out.println(t1.getName() + "中断后的状态：" + t1.getState());
        System.out.println("调用线程对象的isInterrupted 看线程" + t1.getName() + "是否被中断了：" + t1.isInterrupted());

        System.out.println("再次调用线程对象的isInterrupted 看线程" + t1.getName() + "是否被中断了：" + t1.isInterrupted());
        DOING = false;
        System.out.println("调用线程对象的isInterrupted 看线程" + t1.getName() + "是否被中断了：" + t1.isInterrupted());
        DOING = true;
        //中断t1
        t1.interrupt();
        System.out.println("调用线程对象的isInterrupted 看线程" + t1.getName() + "是否被中断了：" + t1.isInterrupted());
        System.out.println("再次调用线程对象的isInterrupted 看线程" + t1.getName() + "是否被中断了：" + t1.isInterrupted());
        DOING = false;
        System.out.println("调用线程对象的isInterrupted 看线程" + t1.getName() + "是否被中断了：" + t1.isInterrupted());

    }

}
