package com.yibo.designpattern.creational.abstractfactory;

/**
 * @author: huangyibo
 * @Date: 2020/4/23 23:01
 * @Description:
 */
public class MateBook extends Book {
    @Override
    protected void getSize() {
        System.out.println("MateBookPro屏幕:13.9英寸");
    }
}
