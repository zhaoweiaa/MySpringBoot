package cn.jxau.zhaowei.myspringboot.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName SecondRunner
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/27 22:20
 * @Version 1.0
 */
@Component
@Order(2)
public class SecondRunner implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(SecondRunner.class);
    @Override
    public void run(String... args) throws Exception {
        logger.warn(logger.getName()+"have done!!!");
        System.out.println("command line ruuner second execute:" + Arrays.asList(args));
    }
}
