package com.Threads.threadState;

/**
 * Created by HP-8560p on 2018/9/6.
 */
public class lightReadWriteLockDemo {

    private volatile int value;

    public int getValue() {
        return value;
    }

    public synchronized int increment(int num) {
        return value += num;
    }
}
