package com.yibo.designpattern.structural.decorator.v2;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 22:26
 * @Description:
 */
public class AbstractDecorator extends ABattercake {

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
