//package com.fxz.demo.schedule;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-01-21 10:16:32
 */
//@Component
//public class ScheduleTasks {
//
//    private static final Logger log = LoggerFactory.getLogger(ScheduleTasks.class);
//    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    @Scheduled(fixedRate = 5000)
//    public void reportCurrentTimeWithFixedRate() {
//        log.info("Current Thread: {}", Thread.currentThread().getName());
//        log.info("Fixed Rate Task: The time is now {}", sdf.format(new Date()));
//    }
//
//    @Scheduled(fixedDelay = 2000)
//    public void reportCurrentTimeWithFixedDelay() {
//        try {
//            TimeUnit.SECONDS.sleep(3);
//            log.info("Fixed Delay Task: The time is now {}", sdf.format(new Date()));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Scheduled(initialDelay = 5000, fixedRate = 5000)
//    public void reportCurrentTimeWithInitialDelay() {
//        log.info("Fixed Rate Task with initial Delay: The time is now {}", sdf.format(new Date()));
//    }
//
//    @Scheduled(cron = "1-2 * * * * *")
//    public void reportCurrentTimeWithCronExpression() {
//        log.info("Cron Expression: The time is now {}", sdf.format(new Date()));
//    }
//
//}
