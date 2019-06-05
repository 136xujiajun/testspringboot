package com.Threads;

/**
 * volatile ：禁止指令重排
 *
 * 保证了不同线程对这个变量进行操作是的可见性，
 * 即一个线程修改了某个变量的值，
 * 这新值对其他线程来说对立即课件的（会立刻写入主内存）
 *
 * 不保证操作原子性
 *
 * new 一个对象
 * 分配内存空间
 * 调用实例化的构造函数
 * 变量指向内存地址
 *
 */
public class Singleton {

    private static volatile Singleton instance = null;

    /**
     * 单例
     * @return
     */
    public static Singleton getInstance(){
        if (null == instance){
            synchronized (Singleton.class){
                if (null == instance)
                instance = new Singleton();
            }
        }
        return instance;
    }

    public void flag(){

        int a = 0;
        boolean flag= true;
        if(a == 0)
            flag = false;

        while(!flag){

        }

    }




}
