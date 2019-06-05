package mybatis;


import mybatis.jdbc.Test;

import java.sql.*;
import java.util.concurrent.Executor;

/**
 * Created by Administrator on 2018/11/15.
 */
public class SimpleExecutor implements Executor {


    public <E> E query(String sql ,Object parameter){
        Connection conn = getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(String.format(sql,Integer.parseInt(String.valueOf(parameter))));
            ResultSet rs = pstmt.executeQuery();
            Test test = new Test();
            while (rs.next()){
                test.setId(rs.getInt(1));
                test.setName(rs.getString(2));
            }

            return (E)test;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Connection getConnection() {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/mydevuse?Unicode=true&characterEncoding=utf-8&useSSL=false";
        String username = "root";
        String password = "xulan";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public void execute(Runnable command) {

    }
}
