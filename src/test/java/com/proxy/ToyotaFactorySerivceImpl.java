package com.proxy;

/**
 * Created by HP-8560p on 2018/8/25.
 */
public class ToyotaFactorySerivceImpl implements ToyotaFactorySerivce {

    public void sellToyota(String seriel){
        System.out.println("卖了一辆丰田"+seriel+"车");
    }
}
