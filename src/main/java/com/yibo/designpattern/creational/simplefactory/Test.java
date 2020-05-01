package com.yibo.designpattern.creational.simplefactory;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 17:02
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        IPhone iphonex = IPhoneFactory.createPhone("iphonex");
        if(iphonex == null){
            return;
        }
        iphonex.getSize();

        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        IPhone iPhone = iPhoneFactory.getPhone(IphoneXs.class);
        if(iPhone == null){
            return;
        }
        iPhone.getSize();


    }
}
