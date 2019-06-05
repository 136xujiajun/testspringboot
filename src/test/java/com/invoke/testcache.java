package com.invoke;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;

/**
 * 测试反射类
 */
public class testcache {

    public Socket socket = new Socket();


    public final static class VolatileLong {
        public volatile long value = 0L;
        public long p1, p2, p3, p4, p5, p6;
    }

    public static long preventFromOptimization(VolatileLong v) {
        return v.p1 + v.p2 + v.p3 + v.p4 + v.p5 + v.p6;
    }

    public static void main(String[] args) {
        PrivateObject privateObject = new PrivateObject("The Private Value");


        Method privateStringMethod = null;
        try {
            //反射得到方法
            privateStringMethod = PrivateObject.class.getDeclaredMethod("getPrivateString", null);
            //打开得到私有方法的权限
            privateStringMethod.setAccessible(true);
            String returnValue = (String)
                    privateStringMethod.invoke(privateObject, null);
            System.out.println("returnValue = " + returnValue);



//            try {
//                Field privateStringField = PrivateObject.class.getDeclaredField("privateString");

//
//                privateStringField.setAccessible(true);
//
//                String fieldValue = (String) privateStringField.get(privateObject);
//                System.out.println("fieldValue = " + fieldValue);
//
//            } catch (NoSuchFieldException e) {
//                e.printStackTrace();
//            }


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        preventFromOptimization(new VolatileLong());


        HashMap<String, String> map = new HashMap<>();

        map.put("aaa", "fsjdfhs");

        String c = map.put("aaa", "dfjdklas");

        System.out.println("" + c);
    }


}
