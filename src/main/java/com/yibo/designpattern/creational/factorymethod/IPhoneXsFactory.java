package com.yibo.designpattern.creational.factorymethod;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 18:39
 * @Description:
 */
public class IPhoneXsFactory extends IPhoneFactory {
    @Override
    public IPhone createPhone() {
        return new IphoneXs();
    }
}
