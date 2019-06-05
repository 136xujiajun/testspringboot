package designPattern.adapter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 适配器模式.
 * 有一个Source类，拥有一个方法，待适配，
 * 目标接口时Targetable，通过Adapter类，
 * 将Source的功能扩展到Targetable里
 */
public class Adapter extends Source implements Targetable {


    @Override
    public void method2() {
        System.out.println("this is the Targetable method");

    }
}
