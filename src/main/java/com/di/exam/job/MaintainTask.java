package com.di.protal.job;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableScheduling
public class MaintainTask {

    @Scheduled(cron = "0 */1 * * * *")
    public void reportCurrentByCron(){
        System.out.println("_____开启定时维护任务————————————————");
    }
}
