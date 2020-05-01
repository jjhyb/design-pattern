package com.yibo.designpattern.creational.factorymethod;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 18:38
 * @Description:
 */
public class IPhoneXFactory extends IPhoneFactory {
    @Override
    public IPhone createPhone() {
        return new IphoneX();
    }
}
