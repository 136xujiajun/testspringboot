package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于jdk的代理类测试
 *
 */
public class CarshopJdkProxy implements InvocationHandler {

    private Object target;

    public CarshopJdkProxy(Object target){
        this.target = target;
    }

    public CarshopJdkProxy(){
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 创建一个代理人
     * @return
     */
    public Object getProxyInstance(){
      return   Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    //生成的反射方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //前置增强
        before();
        Object retObj = method.invoke(target,args);
        //后置增强
        after();

        return retObj;
    }

    private void after() {
        System.out.println("======= 售前服务");
    }

    private void before() {
        System.out.println("======= 售后服务");
    }

}
