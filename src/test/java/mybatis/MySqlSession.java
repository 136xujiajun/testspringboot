package mybatis;



import org.apache.ibatis.binding.MapperProxy;

import java.lang.reflect.Proxy;
import java.util.concurrent.Executor;

/**
 * Created by Administrator on 2018/11/15.
 */
public class MySqlSession {

    private Executor executor = new SimpleExecutor();

    public <T> T selectOne(String statement,Object parameter){
//        return executor.query();
        return null;
    }

    public <T> T getMapper(Class<T> clazz){
//        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(),
//                new Class[]{clazz},new MapperProxy<T>(this,clazz));
        return  null;
    }


}
