package com.yibo.designpattern.creational.abstractfactory;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 22:55
 * @Description:
 */
public class HuaWeiFactory implements AbstractFactory {
    @Override
    public Phone getPhone() {
        return new Mate30Pro();
    }

    @Override
    public Book getBook() {
        return new MateBook();
    }
}
