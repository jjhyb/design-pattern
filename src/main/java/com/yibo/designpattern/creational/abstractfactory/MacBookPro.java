package com.yibo.designpattern.creational.abstractfactory;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 22:47
 * @Description:
 */
public class MacBookPro extends Book {

    @Override
    protected void getSize() {
        System.out.println("MacBookPro屏幕:13英寸");
    }
}
