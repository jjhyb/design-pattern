package com.yibo.designpattern.structural.adapter.classadapter;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 23:52
 * @Description:
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
