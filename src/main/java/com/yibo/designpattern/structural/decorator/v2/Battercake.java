package com.yibo.designpattern.structural.decorator.v2;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 22:14
 * @Description:
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc(){
        return "煎饼";
    }

    @Override
    protected int cost(){
        return 8;
    }
}
