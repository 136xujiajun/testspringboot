package com.threadPool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by HP-8560p on 2018/8/11.
 */
public class FixedSizeThreadPool {

    //仓库
    private BlockingQueue<Runnable> taskQueue;

    //工作线程
    private List<Worker> workers;


    //线程池工作的标识  volatile变量是最新的
    private volatile boolean working = true;


    public FixedSizeThreadPool(int poolSize,int taskQueueSize){

        if(poolSize <=0 || taskQueueSize <=0){
            throw new IllegalArgumentException("参数错误");
        }

        taskQueue = new LinkedBlockingQueue<>(taskQueueSize);

        this.workers =  Collections.synchronizedList(new ArrayList<>());

        for (int i = 0; i < poolSize; i++) {

            Worker worker = new Worker(this);
            worker.start();
            this.workers.add(worker);
        }
    }

    //提交任务的方法
    public boolean submit(Runnable task){

        //不接收新任务
        if(this.working){

            //把线程放入仓库
            return this.taskQueue.offer(task);
        }
        return false;
    }

    //停止线程池的任务
    public void shutdown(){

        this.working = false;

        //中断阻塞线程
        for (Thread t: this.workers){

            if (t.getState().equals(Thread.State.BLOCKED)
                    || t.getState().equals(Thread.State.WAITING)
                    ||t.getState().equals(Thread.State.TIMED_WAITING)){
                //中断线程的方法
                t.interrupt();
            }
        }
    }

    //阻塞的方法

    private static class Worker extends Thread{

        private FixedSizeThreadPool pool;

        public Worker(FixedSizeThreadPool pool){
            super();
            this.pool = pool;
        }

        public void run(){
            int taskCount = 0;

            //队列里有任务，继续执行。
            while(this.pool.working || this.pool.taskQueue.size() > 0){
                Runnable task = null;

                try {
                    if(this.pool.working){
                        //阻塞的线程
                        task =  this.pool.taskQueue.take();
                    }else{
                        //直接执行完,从仓库中去除。
                        task =  this.pool.taskQueue.poll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
                if(task != null){
                    task.run();
                    System.out.println(Thread.currentThread().getName() +
                            "执行完" + (++taskCount) + "个任务");
                }
            }
            System.out.println(Thread.currentThread().getName()+"线程结束");
        }

    }







    public static void main(String[] args) {
        FixedSizeThreadPool pool = new FixedSizeThreadPool(3,6);

        for (int i = 0; i < 6; i++) {

           boolean poolrReturn = pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("任务开始执行。。。。。。");
                    //睡眠两秒
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            });
        }
        pool.shutdown();
    }



}
