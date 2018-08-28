package cn.jxau.zhaowei.myspringboot.hello;

import cn.jxau.zhaowei.myspringboot.runner.FirstRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @ClassName GreetingController
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/27 16:48
 * @Version 1.0
 */
@RestController
@PropertySource({"classpath:application.properties"})
public class GreetingController {
    private Logger logger = LoggerFactory.getLogger(GreetingController.class);
    @Autowired
    private Settings settings;

    @Autowired
    private SettingsByPrefix settingsByPrefix;

    @Value("${web.file.path}")
    private final String uploadPath = null;

    private static final String template = "hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name){
        logger.warn(logger.getName()+ "hava finished greeting method");
        System.out.println(settings.getName()+settings.getDomain());
        System.out.println(settingsByPrefix.getName()+settingsByPrefix.getDomain());

        return new Greeting(counter.incrementAndGet(),
                String.format(template, name) + uploadPath);
    }
}
