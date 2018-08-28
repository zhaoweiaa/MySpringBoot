package cn.jxau.zhaowei.myspringboot.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName FirstRunner
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/27 22:17
 * @Version 1.0
 */
@Component
@Order(1)
public class FirstRunner implements ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger(FirstRunner.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.warn(logger.getName()+"have done!");
        System.out.println("application runner first execute:" + Arrays.asList(args.getSourceArgs()));
    }
}
