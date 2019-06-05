package reflect;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.Constructor;

/**
 * Created by Administrator on 2018/11/9.
 * 使用反射 动态创建对象  两种方式
 */
public class TestClass_3 {

    public static void main(String[] args) throws Exception {
        /**
         * 方法1：通过Class的newInstance()方法
     *           该方法要求该Class对象的对应类有无参构造方法
         *       执行newInstance()实际上就是执行无参构造方法来创建该类的实例
         */
        //      Class  clazz = Class.forName("reflect.User");
        //	Object obj =  clazz.newInstance();

        /**
         * 方法2：通过Constructor的newInstance()方法
         *       先使用Class对象获取指定的Constructor对象
         *       再调用Constructor对象的newInstance()方法来创建该Class对象对应类的对象
         *       通过该方法可选择使用指定构造方法来创建对象
         */

//        User user = new User();
//
//        System.out.println(user.getClass());
//        System.out.println(user.getClass().getClassLoader());
//        System.out.println(user.getClass().getClassLoader().getResource(""));
        Class clazz = Class.forName("reflect.User");
        //指定有参的构造方法
        Constructor constructor = clazz.getConstructor(new Class[]{int.class,String.class});
        //使用有参数的构造方法实例对象
        Object object = constructor.newInstance(new Object[]{1,"scott"});
        //转换为实际的操作类
        User user1 = (User) object;

        //也可以调用无参构造方法,比第一种方法复杂
        object = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
        user1 = (User) object;
        //以下也可以调用无参构造方法
        object = clazz.getConstructor().newInstance();
        //转换为实际操作类
        user1 = (User) object;
    }
}
