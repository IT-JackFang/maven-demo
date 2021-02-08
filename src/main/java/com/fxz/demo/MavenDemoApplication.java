package com.fxz.demo;

import com.fxz.demo.job.TestJob;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-01-21 09:42:09
 */
@SpringBootApplication
@EnableScheduling
public class MavenDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenDemoApplication.class, args);

        try {
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
        }

        /*Person person = new Person();
        person.setId(1);
        person.setName("张三");
        person.setAge(18);
        System.out.println("person = " + person);*/

    }

}
