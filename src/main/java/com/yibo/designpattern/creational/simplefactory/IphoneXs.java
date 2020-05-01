package com.yibo.designpattern.creational.simplefactory;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 16:56
 * @Description:
 */
public class IphoneXs extends IPhone {
    @Override
    protected void getSize() {
        System.out.println("iPhoneXs屏幕:5.8英寸");
    }
}
