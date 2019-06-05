package com.Threads.threadState;

import java.util.concurrent.*;

/**
 * Created by HP-8560p on 2018/9/6.
 */
public class FutureDemo {


    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);

        Future<Long> future = es.submit(new Callable<Long>() {
            public Long call() throws Exception{
                Thread.sleep(10000L);

                return System.currentTimeMillis();
            }
        });
        System.out.println(future.isDone());

        //取消任务
        future.cancel(false);

        try {
            Long result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(future.isDone());
        es.shutdown();

    }





}
