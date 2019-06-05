package com.quartz.quartz1;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by HP-8560p on 2018/8/7.
 */
public class TestQuartz {


    public static void main(String[] args) throws Exception {
        TestQuartz example = new TestQuartz();
        example.run();

    }

    public void run() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy 年 MM 月 dd 日  HH 时 mm 分 ss 秒");

        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();
        System.out.println("--------------- 初始化 -------------------");

        // job1 每20s运行一次
        JobDetail job = newJob(TestMyQuartz.class).withIdentity("job1", "group1")
                .build();

        CronTrigger trigger = newTrigger().withIdentity("trigger1", "group1")
                .withSchedule(cronSchedule("0/20 * * * * ?")).build();

        Date ft = sched.scheduleJob(job, trigger);
        System.out.println(job.getKey().getName() + " 将在: "
                + dateFormat.format(ft) + " 运行 . 并且基于Cron表达式 : "
                + trigger.getCronExpression() + "  (含义:每20s运行一次)");

        job = newJob(MyJob.class).withIdentity("job2", "group1").build();
        trigger = newTrigger().withIdentity("trigger2", "group1")
                .withSchedule(cronSchedule("0/20 * 6-18 ? 1-2,3-7,9-12  MON-FRI")).build();

        ft = sched.scheduleJob(job, trigger);
        System.out.println(job.getKey().getName() + " 将在: "
                + dateFormat.format(ft) + " 运行 . 并且基于Cron表达式 : "
                + trigger.getCronExpression() + "  (含义:偶数分钟的第15秒运行)");

        sched.start();
    }





}
