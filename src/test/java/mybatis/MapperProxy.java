package mybatis;

import com.Threads.Test;
import com.springboot.common.ClassUtil;
import mybatis.jdbc.TestMapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/11/15.
 */
public class MapperProxy<T> implements InvocationHandler {

    private final MySqlSession sqlSession;

    private final Class<T> mapperInterface;

    public MapperProxy(MySqlSession sqlSession, Class<T> mapperInterface) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass().getName().equals(TestMapperXml.nameSpace)){
            String sql = TestMapperXml.methodSqlMapping.get(method.getName());
            System.out.println(String.format("SQL [%s], parameter [%s] ",sql,args[0]));
            return sqlSession.selectOne(sql,String.valueOf(args[0]));
        }
        return null;
    }
}
