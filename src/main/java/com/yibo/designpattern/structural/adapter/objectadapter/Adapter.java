package com.yibo.designpattern.structural.adapter.objectadapter;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 0:03
 * @Description:
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //对该方法增强
        adaptee.adapteeRequest();
        //对该方法增强
    }
}
