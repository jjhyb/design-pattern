package com.yibo.designpattern.structural.proxy.dynamicproxy;

import com.yibo.designpattern.structural.proxy.Order;
import com.yibo.designpattern.structural.proxy.OrderService;
import com.yibo.designpattern.structural.proxy.OrderServiceImpl;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 23:38
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        OrderService orderServiceDynamicProxy = (OrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
