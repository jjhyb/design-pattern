package com.yibo.designpattern.structural.decorator.v2;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 22:45
 * @Description:
 */
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"，加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
