package com.yibo.designpattern.structural.proxy.staticproxy;

import com.yibo.designpattern.structural.proxy.Order;
import com.yibo.designpattern.structural.proxy.OrderService;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 22:41
 * @Description:
 */
public class OrderServiceStaticProxy {

    private OrderService orderService;

    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    public int saveOrder(Order order){
        beforeMethod();
        int i = orderService.saveOrder(order);
        afterMethod();
        return i;
    }

    private void beforeMethod(){
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
