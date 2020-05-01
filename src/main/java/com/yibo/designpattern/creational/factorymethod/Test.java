package com.yibo.designpattern.creational.factorymethod;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 17:02
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        IPhoneFactory iPhoneFactory = new IPhoneXFactory();
        IPhone iPhone = iPhoneFactory.createPhone();
        iPhone.getSize();
    }
}
