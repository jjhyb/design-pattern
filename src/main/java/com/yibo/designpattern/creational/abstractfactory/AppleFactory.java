package com.yibo.designpattern.creational.abstractfactory;


/**
 * @author: huangyibo
 * @Date: 2020/4/23 22:49
 * @Description:
 */
public class AppleFactory implements AbstractFactory {

    @Override
    public Phone getPhone() {
        return new IphoneX();
    }

    @Override
    public Book getBook() {
        return new MacBookPro();
    }
}
