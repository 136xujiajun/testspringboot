package com.lock;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by HP-8560p on 2018/8/1.
 */

@RequestMapping("/redisLock")
public class RedisLock implements Lock{

    //@Autowired
    //RedisUtil redis;

    private ThreadLocal<String> local = new ThreadLocal<String>();
    Random ran = new Random();

    @Override
    public void lock() {
        if (tryLock()){
            return;
        }else {
            try {
                Thread.sleep(ran.nextInt());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            lock();
        }

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        String uuid = UUID.randomUUID().toString();
       // String setRedisLock = redis
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public Condition newCondition() {
        return null;
    }



}
