package com.fxz.demo.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.SchedulerException;

import java.time.LocalDateTime;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-01-21 09:27:04
 */
public class TestJob implements Job {

    @Override
    public void execute(JobExecutionContext context) {
        Object tv1 = context.getTrigger().getJobDataMap().get("t1");
        Object tv2 = context.getTrigger().getJobDataMap().get("t2");

        Object jv1 = context.getJobDetail().getJobDataMap().get("j1");
        Object jv2 = context.getJobDetail().getJobDataMap().get("j2");

        Object sv = null;
        try {
            sv = context.getScheduler().getContext().get("skey");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

        System.out.println("tv1 = " + tv2);
        System.out.println("jv1 = " + jv2);
        System.out.println(sv);
        System.out.println("date: " + LocalDateTime.now());

    }

}
