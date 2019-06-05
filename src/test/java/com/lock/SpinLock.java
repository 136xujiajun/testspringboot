package com.lock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by HP-8560p on 2018/9/4.
 */
public class SpinLock {

    //java中原子（CAS）操作
    AtomicReference<Thread> owner = new AtomicReference<Thread>();//持有自旋锁的线程对象
    private int count;
    public void lock() {
        Thread cur = Thread.currentThread();
        //lock函数将owner设置为当前线程，并且预测原来的值为空。unlock函数将owner设置为null，并且预测值为当前线程。当有第二个线程调用lock操作时由于owner值不为空，导致循环

        //一直被执行，直至第一个线程调用unlock函数将owner设置为null，第二个线程才能进入临界区。
        while (!owner.compareAndSet(null, cur)){

            System.out.println("当前线程"+Thread.currentThread().getName());
        }
    }
    public void unLock() {
        System.out.println("unLock执行begin");
        Thread cur = Thread.currentThread();
        boolean a =owner.compareAndSet(cur, null);
        System.out.println("unLock执行end" +a);
    }


}

class Test implements Runnable {
    static int sum;
    private SpinLock lock;

    public Test(SpinLock lock) {
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException {
        SpinLock lock = new SpinLock();


        for (int i = 0; i < 100; i++) {
            System.out.println("主线程执行"+i);
            Test test = new Test(lock);

            Thread.sleep(2000L);

            //这个方法是执行继承Runnable接口实现类的run方法
            Thread t = new Thread(test);
            t.start();
        }

    }

    @Override
    public void run() {

        this.lock.lock();
        sum++;
        this.lock.unLock();

        System.out.println(Thread.currentThread().getName() +"执行run方法");
    }
}
