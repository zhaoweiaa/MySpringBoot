package cn.jxau.zhaowei.myspringboot.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName SettingsByPrefix
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/27 20:54
 * @Version 1.0
 */
@Component
@PropertySource("classpath:settings.properties")
@ConfigurationProperties("test")
public class SettingsByPrefix {
    private String domain;
    private String name;

    public String getDomain() {
        return domain;
    }

    public String getName() {
        return name;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setName(String name) {
        this.name = name;
    }
}
