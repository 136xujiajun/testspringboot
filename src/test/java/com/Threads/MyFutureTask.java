package com.Threads;

import java.util.concurrent.*;

/**
 * Created by HP-8560p on 2018/10/14.
 */
public class MyFutureTask<T> implements Runnable,Future<T> {

    Callable<T> callable;//业务逻辑
    T result;//执行结果
    String state = "NEW";//新建状态

    public MyFutureTask(Callable<T> callable){
        this.callable = callable;

    }


    /**
     * run 和get不是同一个线程
     */
    @Override
    public void run() {
        try {
           result =  callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            state = "END";
        }
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"执行完毕通知主线程");
            this.notifyAll();
        }
    }

    /**
     * 返回结果
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @Override
    public T get() throws InterruptedException, ExecutionException {
        if("END".equals(state)){
            return result;
        }
        Thread currentThread =Thread.currentThread();
        System.out.println(currentThread.getName()+"没有结果,进入等待");
        //没有执行完毕，则阻塞线程(Main 主线程),等待结果（执行完毕）
        synchronized (this){
            this.wait();

        }
        return result;
    }
    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }


    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }


}
