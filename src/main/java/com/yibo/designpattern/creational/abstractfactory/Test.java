package com.yibo.designpattern.creational.abstractfactory;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 23:08
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Phone iPhone = appleFactory.getPhone();
        Book macBook = appleFactory.getBook();
        iPhone.getSize();
        macBook.getSize();

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        Phone mate30Pro = huaWeiFactory.getPhone();
        Book mateBook = huaWeiFactory.getBook();
        mate30Pro.getSize();
        mateBook.getSize();
    }
}
