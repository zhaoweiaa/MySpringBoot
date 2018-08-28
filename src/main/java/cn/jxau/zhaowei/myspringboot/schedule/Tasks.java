package cn.jxau.zhaowei.myspringboot.schedule;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName Tasks
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/28 1:49
 * @Version 1.0
 */
@Component
@EnableScheduling
public class Tasks {
    @Scheduled(fixedRate = 1000*5)//5s
    public void reportCurrentTime(){
        System.out.println(LocalTime.now().
                format(DateTimeFormatter
                        .ofPattern("HH:mm:ss")));
    }

    @Scheduled(cron = "0/10 * * ? * ?")//10s执行一次
    public void reportCurrentTimeByCron(){
        System.out.println("cron:" + LocalTime.now().
                format(DateTimeFormatter
                        .ofPattern("HH:mm:ss")));
    }
}
