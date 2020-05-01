package com.yibo.designpattern.structural.adapter.classadapter;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 23:53
 * @Description:
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //对该方法增强
        super.adapteeRequest();
        //对该方法增强
    }
}
