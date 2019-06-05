package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author
 *class 类的使用：获取类的属性、方法、构造方法、类的相关信息
 */
public class TestClass_1 {

    public static void main(String[] args) throws ClassNotFoundException{
        //forName(String className)返回与带有给定字符串名的类或接口相关联的 Class 对象。
        Class clazz = Class.forName("java.lang.String");
        //getDeclaredFields();返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段，
        // 包括公共、保护、默认（包）访问和私有字段，但不包括继承的字段。
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("----------------------显示类的属性--------------");
        for (Field field:fields){
            //getName()返回此 Field 对象表示的字段的名称
            //getType()返回一个 Class 对象，它标识了此 Field 对象所表示字段的声明类型。
            System.out.println(field.getName() + "            " + field.getType());
        }
        System.out.println("-----------------------显示类的方法--------------");
        //getDeclaredMethods() 返回一个 Method 对象，
        // 该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method :methods ){
            System.out.println(method.getName());
        }
        //Constructor构造函数
        Constructor[] constructors = clazz.getDeclaredConstructors();
//        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.toString());
        }
        System.out.println("----------------------获取类的相关的信息----------------------------------------------");
        System.out.println("类所在的包为:" + clazz.getPackage().getName());
        System.out.println("类名:" + clazz.getName());
        System.out.println("父类的名称: " + clazz.getSuperclass().getName());
    }
}
