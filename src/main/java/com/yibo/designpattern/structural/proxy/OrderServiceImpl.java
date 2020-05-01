package com.yibo.designpattern.structural.proxy;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 22:37
 * @Description:
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        //spring会自己注入，这里就直接new
        orderDao = new OrderDaoImpl();
        System.out.println("service调用dao添加order");
        return orderDao.insert(order);
    }
}
