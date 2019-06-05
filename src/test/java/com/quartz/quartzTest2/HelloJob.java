package com.quartz.quartzTest2;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.util.Date;

/**
 * Created by HP-8560p on 2018/7/31.
 */
public class HelloJob implements Job{
    /**
     * 实现你自己的定时方法 ,至于里面写什么,您说了蒜!<br>
     * 这里只输出 HelloWorld!
     */
    @Override
    public void execute(JobExecutionContext context){
        // 输出 HelloWorld !
        System.out.println("Hello World! - " + new Date());
    }

}
