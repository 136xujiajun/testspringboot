package com.Threads;

/**
 *死锁 线程A拿到了锁还没有释放
 *     线程B拿到了锁还没有释放
 *     线程A又调用线程b，线程B又调用线程A
 *
 */
public class DeadLockTest {

    public static void main(String[] args) {
        String str1 = "支援1";
        String str2 = "支援2";

        DeadLockTest deadLockTest = new DeadLockTest();
        Lock lock = deadLockTest.new Lock(str1,str2);
        Lock lock2 = deadLockTest.new Lock(str2,str1);

        new Thread(lock,"资源1").start();

        new Thread(lock2,"资源2").start();

    }


    class Lock implements Runnable{

        private String str1;
        private String str2;

        public Lock(String str1,String str2){
            this.str1 = str1;
            this.str2 = str2;
        }

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName()+"在运行");
            synchronized (str1){
                System.out.println(Thread.currentThread().getName()+"锁住"+str1);
                synchronized (str2){
                    System.out.println(Thread.currentThread().getName()+"锁住"+str1);

                }
            }
        }
    }

}
