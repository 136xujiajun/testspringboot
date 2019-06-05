package com.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib  集成到spring中了  cglib基于字节实现的
 */
public class CarshopCglibProxy implements MethodInterceptor {

    private Object target;

    public CarshopCglibProxy(Object target) {
        this.target = target;
    }

    /**
     * 创建代理实例
     *
     * @return
     */
    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前");
        Object retobj = method.invoke(target,objects);
        System.out.println("后");
        return retobj;
    }
}
