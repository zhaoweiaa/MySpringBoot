package cn.jxau.zhaowei.myspringboot;

import cn.jxau.zhaowei.myspringboot.applicationContext.RootApplicationContext;
import cn.jxau.zhaowei.myspringboot.applicationContext.SubApplicationContext;
import cn.jxau.zhaowei.myspringboot.runner.FirstRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class MyspringbootApplication {
    private Logger logger = LoggerFactory.getLogger(MyspringbootApplication.class);
    @Bean
    @Order(3)
    public ApplicationRunner thirdRunner(){
        logger.warn(logger.getName()+"have done");
        return new FirstRunner()::run;
    }

    @Bean
    @Order(4)
    public CommandLineRunner fouthRunner(){
        logger.warn(logger.getName()+"have done");
        return args -> {
            logger.warn(logger.getName()+"have done");
            System.out.println("fouth runner" + Arrays.asList(args));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);

//        new SpringApplicationBuilder()
//                .sources(MyspringbootApplication.class)
//                .child(SubApplicationContext.class)
//                .child(RootApplicationContext.class)
//                .bannerMode(Banner.Mode.OFF).run(args);
    }
}
