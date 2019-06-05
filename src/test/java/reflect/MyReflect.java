package reflect;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/11/9.
 */
public class MyReflect {

    public static void main(String[] args) throws Exception{
        User user = new User();
        reflect(user);
    }

    /**
     * 通过request中获得data数据
     * 再根据data数据给调用set方法赋值
     * 我这一步做的是拼接字段调用set方法
     * @param object
     */

    //根据字段名和



    private static void reflect(Object object) throws Exception{
        //得到Class 对象。
        Class clazz = object.getClass();
        //得到类中的所有字段
        Field[] fields = clazz.getDeclaredFields();

        //相当于得到的字段集合。
        List<String> strList = new ArrayList<>();
        for (Field field : fields) {
            //得到字段名
            strList.add(field.getName());
        }

        //得到所有方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method :methods ){
            for (Field field : fields) {
                String str1 = "set"+toUpperCaseFirstOne(field.getName());
                Method method1 = clazz.getMethod(str1,new Class[]{field.getType()});
                Object result =method.invoke(object, new Object[]{"scott"});
            }
        }


    }
    public static String toUpperCaseFirstOne(String s){
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }

}
