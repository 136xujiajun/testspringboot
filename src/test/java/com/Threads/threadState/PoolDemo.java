package com.Threads.threadState;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by HP-8560p on 2018/9/6.
 */
public class PoolDemo {

    public static void main(String[] args) {

        //得到固定池大小，任务队列容量无界的线程池
        ExecutorService fixedSizePool = Executors.newFixedThreadPool(5);

        //创建一个大小无界的缓冲线程池
        ExecutorService cachPool = Executors.newCachedThreadPool();

        //创建一个单线程的线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        //创建一个forkjoin线程池
        ExecutorService workStealingPool = Executors.newWorkStealingPool();

        //创建一个指定核心线程数的调度线程池
        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
    }

}
