package com.springboot;

import java.io.File;

public class HelloWorld {

    //常量、静态变量
    private final int i = 0;
    private static int k = 0;//k=10
    //成员变量
    private Object obj = new Object();
    private int sss = 0;

    //局部变量
    public void methodOne(int i){
        int j = 0;
        int sum = i + j;
        Object acb = obj;
        long start = System.currentTimeMillis();
        methodTwo();//调用其他方法，会多压入一个栈帧。
        // methodOne可能会用到methodTwo的运算结果，栈的结果是先进后出的所以methodOne在栈底
        return;//出口 分为正常出口和异常出口
    }

    private void methodTwo() {
        File file = new File("");

    }

    public static  void methodThree(){
        methodThree();//栈中有多少个栈帧  会死循环。内存溢出
    }


    public static void main(String[] args) {
        methodThree();
    }


}
