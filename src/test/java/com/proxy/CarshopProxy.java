package com.proxy;

/**
 * Created by HP-8560p on 2018/8/25.
 */
public class CarshopProxy implements BenzFactoryService,BmwFactoryService{


    private BenzFactoryServiceImpl target;
    private BmwFactoryServiceImpl target1;

    public void sellBenz(String str){
        before();//方法前
        target.sellBenz(str);
        after();//方法后

    }

    private void after() {
        System.out.println("售后服务");
    }

    private void before() {
        System.out.println("售前服务");

    }
}
