package com.Threads.threadState;

/**
 * 同步块
 *    共用外界的一把锁 保护外界资源
 * 同步方法
 *    当要保护对象中的属性值,在被多个线程并发修改时的结果正确
 * 静态同步方法
 *    当要保护类的静态属性值，在被多个线程并发修改时的结果正确
 *
 *
 */
public class SyncDemo {
    Object lock = new Object();


    public void setValue2(){
        synchronized (lock){

        }
    }

    public synchronized void serValue(){

    }

    public static synchronized void serValue3(){

    }

    public static void main(String[] args) {
        SyncDemo demo = new SyncDemo();
        //对象锁
        demo.serValue();

        serValue3();
    }


}
