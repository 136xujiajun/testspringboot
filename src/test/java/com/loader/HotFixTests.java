package com.loader;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * 热加载
 */
public class HotFixTests {


    public static void main(String[] args) throws Exception{

        //1.指定jar的地址
        URL dab = new URL("file:C:\\Users\\Administrator\\Desktop\\IOT\\MyGen.jar");
        //2.创建加载类实例（对象）
        URLClassLoader classLoader1 = new URLClassLoader(new URL[] {dab});
        //引用jar包，是同application class loader去加载，满足不了
        //自己创建类加载实例，实例加载jar、class
        //类加载器，加载类的工具，去置顶的地方加载我们的class
        while(true){
            //1.指定jar的地址
            URL dabaojiaJarUrl = new URL("file:C:\\Users\\Administrator\\Desktop\\IOT\\MyGen.jar");
            //2.创建加载类实例（对象） 先在父类中加载  当父加载器加载到了这个类，子类就不会加载，当父类中找不到时才会加载子类
            URLClassLoader classLoader = new URLClassLoader(new URL[] {dabaojiaJarUrl},classLoader1);

            //反射根据类名和位置找到这个对象
            Class dabaoJianClass = classLoader.loadClass("com.threadPool.FixedSizeThreadPool");
            //3.构建一个类  得到这个类
            Object dabaojian = dabaoJianClass.newInstance();
            dabaoJianClass.getMethod("shutdown").invoke(dabaojian);

            //睡眠三秒
            Thread.sleep(3000L);

        }

    }
}
