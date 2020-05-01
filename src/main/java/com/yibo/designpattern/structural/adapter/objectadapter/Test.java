package com.yibo.designpattern.structural.adapter.objectadapter;

/**
 * @author: huangyibo
 * @Date: 2020/4/25 0:05
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
