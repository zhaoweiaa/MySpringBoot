package cn.jxau.zhaowei.myspringboot.jdbcdemo;

import java.sql.*;
import java.util.Objects;

/**
 * @ClassName H2
 * @Description TODO
 * @Author zhaowei
 * @Date 2018/8/29 17:03
 * @Version 1.0
 */
public class H2 {

    private static final Connection connection;

    static {
        try {
            connection = DriverManager.getConnection("jdbc:h2:mem:myh2", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("h2 数据库连接异常");
        }
    }
    public void testConn(){
        try {
            PreparedStatement psmt = connection.prepareStatement("select * from myh2.staff");
            ResultSet resultSet = psmt.executeQuery();
            while(resultSet.next()){
                System.out.print(resultSet.getInt(1) + " ");
                System.out.print(resultSet.getInt(2) + " ");
                System.out.print(resultSet.getInt(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(Objects.nonNull(connection)){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("数据库连接未能关闭");
                }
            }
        }
    }
    public static void main(String[] args) {
        new H2().testConn();
    }
}
