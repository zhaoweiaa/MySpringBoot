package cn.jxau.zhaowei.myspringboot;

import cn.jxau.zhaowei.myspringboot.Modal.User;
import cn.jxau.zhaowei.myspringboot.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

/**
 * @ClassName MybatisTest
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/29 21:41
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MybatisTest {

    @Autowired
    public UserMapper userMapper;

    public void test1() throws Exception{
        final int row1 = userMapper.insert(new User(System.nanoTime(), "123", "123"));
        log.info("added", row1);
        final int row2 = userMapper.insert(new User(System.nanoTime(), "456", "456"));
        log.info("added", row2);
        final int row3 = userMapper.insert(new User(System.nanoTime(), "789", "789"));
        log.info("added", row3);
        List<User> users = userMapper.findUserByUserName("456");
        log.info("users:", users);
    }
}
