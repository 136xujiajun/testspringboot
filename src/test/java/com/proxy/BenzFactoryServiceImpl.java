package com.proxy;

/**
 * Created by HP-8560p on 2018/8/25.
 */
public class BenzFactoryServiceImpl implements BenzFactoryService {


    @Override
    public void sellBenz(String str) {
        System.out.println("购买奔驰"+str);
    }
}
