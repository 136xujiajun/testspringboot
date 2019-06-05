package com.Threads.threadState;

import org.springframework.web.servlet.ViewResolver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by HP-8560p on 2018/9/6.
 */
public class VisibilityDemo {

    //状态标识
    private static volatile boolean is = true;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (is) {
                    i++;
                }
                System.out.println(i);
            }
        }).start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        VisibilityDemo.is = false;
        System.out.println("改变值为 false了");
    }

}
