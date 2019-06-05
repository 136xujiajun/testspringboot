package com.quartz.quartz1;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by HP-8560p on 2018/8/7.
 */
public class MyJob implements Job {


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.err.println("8888888888888888888888888888888888");
    }
}
