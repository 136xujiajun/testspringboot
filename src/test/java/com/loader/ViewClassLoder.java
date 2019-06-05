package com.loader;


import sun.net.spi.nameservice.dns.DNSNameService;

/**
 * Created by HP-8560p on 2018/9/3.
 */
public class ViewClassLoder {

    public static void main(String[] args) {

        //rt.jar 核心类库
        System.out.println("Object用的类加载器："+ Object.class.getClassLoader());

        //加载拓展库类中的Extension ClassLoader
        System.out.println("DNANameService.class 拓展类库加载器："+ DNSNameService.class.getClassLoader());

        //用户应用程序的类
        System.out.println("用户程序的上级："+ViewClassLoder.class.getClassLoader().getParent());

        System.out.println("用户程序的上级的上级："+ViewClassLoder.class.getClassLoader().getParent().getParent());

    }
}
