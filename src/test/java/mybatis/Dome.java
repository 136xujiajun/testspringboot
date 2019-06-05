package mybatis;

import mybatis.jdbc.Test;
import mybatis.jdbc.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/11/14.
 */
public class Dome {

    public static SqlSession getSqlSession() throws FileNotFoundException {
        //读取配置文件
        InputStream configFile = new FileInputStream("E:\\JavaDocument\\ssmWork\\springboot\\mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configFile);
        return sqlSessionFactory.openSession(true);
    }

    public static void main(String[] args) throws FileNotFoundException{
        SqlSession sqlSession = getSqlSession();
        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        Test test = testMapper.selectByPrimaryKey(1);
    }

}
