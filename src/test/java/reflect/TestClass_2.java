package reflect;

/**
 * Created by Administrator on 2018/11/9.
 */
public class TestClass_2 {

    public static void main(String[] args)  throws  ClassNotFoundException{
        User user =new User();
        //第一种: 对象.class
        Class clazz = user.getClass();
        //使用包装器获取Class 对象
        String str = "";
        clazz = str.getClass();
        //第二种: 类.class
        clazz = User.class;
        clazz = String.class;
        clazz = Integer.class;

        //第三种:Class.forName();
        clazz = Class.forName("java.lang.String");
        clazz = Class.forName("java.lang.Long");

        //第四种:包装类.type
        clazz = Integer.TYPE;

    }
}