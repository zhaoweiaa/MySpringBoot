package cn.jxau.zhaowei.myspringboot.jdbcdemo;

import cn.jxau.zhaowei.myspringboot.Modal.Staff;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName SpringJDBC
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/29 18:22
 * @Version 1.0
 */
@Component
public class SpringJDBC {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @SneakyThrows
    public List<Staff> test(){
        List<Staff> staffList = jdbcTemplate.query("select * from staff", new RowMapper<Staff>() {
            @Override
            public Staff mapRow(ResultSet resultSet, int i) throws SQLException {
                Staff staff = new Staff();
                System.out.println(resultSet+";"+i);
                staff.setId(resultSet.getString(1));
                staff.setName(resultSet.getString(2));
                staff.setAge(resultSet.getInt(3));
                return staff;
            }
        });
        for (Staff staff:staffList){
            System.out.println(staff);
        }
        return staffList;
    }
}
