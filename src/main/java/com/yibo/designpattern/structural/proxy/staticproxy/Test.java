package com.yibo.designpattern.structural.proxy.staticproxy;

import com.yibo.designpattern.structural.proxy.Order;
import com.yibo.designpattern.structural.proxy.OrderServiceImpl;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 23:19
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        OrderServiceStaticProxy staticProxy = new OrderServiceStaticProxy(new OrderServiceImpl());
        staticProxy.saveOrder(order);
    }
}
