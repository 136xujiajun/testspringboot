package reflect;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/11/9.
 */
public class TestClass_5 {

    public static void main(String[] args) throws Exception{
        Class clazz = User.class;
        Object object = clazz.newInstance();

        //调用该对象的 setName方法
        Method method = clazz.getMethod("setName", new Class[]{String.class});
        Object result =method.invoke(object, new Object[]{"scott"});       //  obj.setName("scott");
        System.out.println("返回值为："+result);

        //调用对象的getName()方法
        Method method1 = clazz.getMethod("getName", new Class[]{});
        Object obj1 = method1.invoke(object, new Object[]{});
        System.out.println("返回值为："+obj1);


    }


}
