package cn.jxau.zhaowei.myspringboot.controller;

import cn.jxau.zhaowei.myspringboot.Modal.Staff;
import cn.jxau.zhaowei.myspringboot.Modal.User;
import cn.jxau.zhaowei.myspringboot.jdbcdemo.SpringJDBC;
import cn.jxau.zhaowei.myspringboot.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName H2Controller
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/29 18:48
 * @Version 1.0
 */
@RestController
@Slf4j
public class H2Controller {

    @Autowired
    private SpringJDBC springJDBC;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/staffs")
    public List<Staff> findStaffs(){
        log.info("find staffs");
        return springJDBC.test();
    }

    @RequestMapping("/saveUser")
    public int insertUser(){
        log.info("save user", Instant.now());
        return userMapper.insert(new User(System.nanoTime()%10000, "123", "123"));
    }
    @RequestMapping("/getUsers")
    public List<User> findUserByName(@RequestParam("username") String username){
        List<User> users = null;
        if(Objects.nonNull(username)){
            log.info("get users");
            users = userMapper.findUserByUserName(username);
        }
        return users;
    }
}
