package com.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by HP-8560p on 2018/8/25.
 */
public class Client {

    public static void main(String[] args) {

        //奔驰工厂
        BenzFactoryServiceImpl benzFactoryService = new BenzFactoryServiceImpl();
        //宝马工厂
        BmwFactoryServiceImpl bmwFactoryService = new BmwFactoryServiceImpl();

//        //代理类
        CarshopJdkProxy carshopJdkProxy = new CarshopJdkProxy();


//        代理类代理两个类 bengin
        carshopJdkProxy.setTarget(benzFactoryService);
        BenzFactoryService seller = (BenzFactoryService) carshopJdkProxy.getProxyInstance();
//        BenzFactoryService seller = (BenzFactoryService) Proxy.newProxyInstance(BenzFactoryServiceImpl.class.getClassLoader(),
//                new Class[]{ BenzFactoryServiceImpl.class},carshopJdkProxy);
        seller.sellBenz("S级");

        carshopJdkProxy.setTarget(bmwFactoryService);
        BmwFactoryService seller2 = (BmwFactoryService) carshopJdkProxy.getProxyInstance();
//        BmwFactoryServiceImpl seller2 = (BmwFactoryServiceImpl) Proxy.newProxyInstance(BmwFactoryServiceImpl.class.getClassLoader(),
//                new Class[]{BmwFactoryServiceImpl.class}, carshopJdkProxy);
        seller2.sellBenz("5级");

//        代理类代理两个类  end

        ToyotaFactorySerivceImpl toyotaFactorySerivce = new ToyotaFactorySerivceImpl();

        CarshopCglibProxy carshopCglibProxy = new CarshopCglibProxy(toyotaFactorySerivce);
        ToyotaFactorySerivceImpl sellercglib = (ToyotaFactorySerivceImpl)carshopCglibProxy.getProxyInstance();
        System.out.println(sellercglib.getClass());
        sellercglib.sellToyota("我要买一辆车");

        CarshopProxy carshopProxy = new CarshopProxy();
        carshopProxy.sellBenz("S级");
        System.out.println("我买了一辆奔驰S级轿车");

    }

}
