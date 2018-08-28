package cn.jxau.zhaowei.myspringboot.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName Settings
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/27 20:46
 * @Version 1.0
 */
@Component
@PropertySource("classpath:settings.properties")
public class Settings {

//    public Settings() throws Exception {
//        throw new Exception("demo start exception");
//    }

    @Value("${test.domain}")
    private String domain;
    @Value("${test.name}")
    private String name;

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }
}
