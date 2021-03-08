package com.fxz.demo.job;

/**
 * 描述：Quartz定时任务
 *
 * @author Fang
 * @date 2021-01-21 09:33:17
 */
public class QuartzTest {

    public static void main(String[] args) {
        /*try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.getContext().put("skey", "svalue");

            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1")
                    .usingJobData("t1", "tv1")
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3)
                        .repeatForever())
                    .build();
            trigger.getJobDataMap().put("t2", "tv2");


            JobDetail jobDetail = JobBuilder.newJob(TestJob.class)
                    .withIdentity("myJob", "myGroup")
                    .usingJobData("j1", "jv1")
                    .build();
            jobDetail.getJobDataMap().put("j2", "jv2");

            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();

        } catch (SchedulerException e) {
            e.printStackTrace();
        }*/
    }

}
