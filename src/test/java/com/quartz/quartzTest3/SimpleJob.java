package com.quartz.quartzTest3;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by HP-8560p on 2018/7/31.
 */
public class SimpleJob implements Job {

    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        // job 的名字
        String jobName = context.getJobDetail().getKey().getName();

        // 任务执行的时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy 年 MM 月 dd 日  HH 时 mm 分 ss 秒");
        String jobRunTime = dateFormat.format(Calendar.getInstance().getTime());

        // 输出任务执行情况
        System.err.println("任务 : " + jobName + " 在  " +jobRunTime + " 执行了 ");
    }
}
