package reflect;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2018/11/9.
 */
public class TestClass_4 {

    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("reflect.User");
        Object object = clazz.newInstance(); //得到类的实例
        //获得User类中指定属性对应的Field对象(每个属性对应一个Field对象)
        Field field = clazz.getDeclaredField("name");

        //取消属性的访问权限控制,即使private 属性也可以进行访问
        field.setAccessible(true);
        //调用 getter 方法获取属性值
        System.out.println(field.get(object));
        //调用 setter 方法给属性赋值
        field.set(object,"scott");
        //调用getter 方法获取对应属性修改的值
        System.out.println(field.get(object));
    }
}
