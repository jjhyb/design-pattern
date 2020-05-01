package com.yibo.designpattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 23:23
 * @Description:
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod();
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(){
        System.out.println("JDK动态代理 before code");
    }

    private void afterMethod(){
        System.out.println("JDK动态代理 after code");
    }
}
