package mybatis;

import com.Threads.Test;

/**
 * Created by Administrator on 2018/11/15.
 */
public class BootStrap {

    public static void start(){
        MySqlSession sqlSession = new MySqlSession();
        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        Test test = testMapper.selectByPrimary(1);
        System.out.println(test);
    }

    public static void main(String[] args) {
        start();
    }
}
