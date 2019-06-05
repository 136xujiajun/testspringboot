import org.apache.ibatis.session.SqlSession;
import reflect.Test;

/**
 * Created by Administrator on 2018/11/14.
 */
public class JDBCDemo {


    private static SqlSession sqlSession;

    public static void main(String[] args) {
        SqlSession sqlSession = getSqlSession();

        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);

        Test test = testMapper.selectByPrimaryKey(1);

    }


    public static SqlSession getSqlSession() {
        return sqlSession;
    }
}
