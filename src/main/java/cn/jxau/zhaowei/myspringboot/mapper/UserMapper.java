package cn.jxau.zhaowei.myspringboot.mapper;

import cn.jxau.zhaowei.myspringboot.Modal.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/29 21:27
 * @Version 1.0
 */
@Mapper
@Component
public interface UserMapper {

    /**
     * @Author zhaowei
     * @Description //TODO 
     * @Date 21:30 2018/8/29
     * @Param [username]
     * @return java.util.List<cn.jxau.zhaowei.myspringboot.Modal.User>
     **/
    @Select("select * from t_user where username = #{username}")
    public List<User> findUserByUserName(@Param("username") String username);

    /**
     * @Author zhaowei
     * @Description //TODO 
     * @Date 21:32 2018/8/29
     * @Param [user]
     * @return int
     **/
    int insert(User user);
}
