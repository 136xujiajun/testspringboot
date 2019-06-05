package mybatis.jdbc;


import java.sql.*;

/**
 * Created by Administrator on 2018/11/14.
 */
public class JDBCDemo {

    public static void main(String[] args) {

    }

    public static int insert(Test test) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydevuse?Unicode=true&characterEncoding=utf-8&useSSL=false");
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement("INSERT INTO test VALUE (?,?,?)");
            if (null != test.getId()){
                preparedStatement.setInt( (Integer)1,test.getId());
            }else {
                preparedStatement.setNull((Integer)1,56);
            }
            preparedStatement.setInt((Integer)2,test.getNums());
            preparedStatement.setString((Integer)3,test.getName());
            connection.commit();
            return preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (null != connection){
                connection.close();
            }
        }
        return 0;
    }


    public static Test get(int id){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Test test = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydevuse?Unicode=true&characterEncoding=utf-8&useSSL=false");
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement("INSERT INTO test VALUE (?,?,?)");
            preparedStatement.setInt((Integer)1,id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                test = new Test();
                test.setId(resultSet.getInt(1));
                test.setNums(resultSet.getInt(2));
                test.setName(resultSet.getString(3));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return null;

    }
}




























