package com.yibo.designpattern.structural.adapter.classadapter;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 23:54
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
