package com.yibo.designpattern.structural.decorator.v2;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 22:45
 * @Description:
 */
public class EggSausageDecorator extends AbstractDecorator {
    public EggSausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"，加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
