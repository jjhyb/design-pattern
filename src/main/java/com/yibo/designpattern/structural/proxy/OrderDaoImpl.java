package com.yibo.designpattern.structural.proxy;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 22:36
 * @Description:
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("添加order成功");
        return 1;
    }
}
