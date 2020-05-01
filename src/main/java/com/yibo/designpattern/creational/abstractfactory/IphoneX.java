package com.yibo.designpattern.creational.abstractfactory;


/**
 * @author: huangyibo
 * @Date: 2020/4/23 16:54
 * @Description:
 */
public class IphoneX extends Phone {
    @Override
    protected void getSize() {
        System.out.println("iPhoneX屏幕:5.8英寸");
    }
}
