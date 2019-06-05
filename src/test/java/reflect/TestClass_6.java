package reflect;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 2018/11/9.
 * 动态创建一维数组，并给数组赋值：
 */
public class TestClass_6 {

    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("java.lang.Integer");
        Object array = Array.newInstance(clazz,10);//根据类的class 创建大小为10的数组
        Array.set(array,5,10);//给数组的第5个元素赋值为10
        Object el = Array.get(array,5);//取出数组的第5个元素值显示
        System.out.println(el);

    }

}
