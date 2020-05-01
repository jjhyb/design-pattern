package com.yibo.designpattern.structural.decorator.v1;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 22:17
 * @Description:
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+"，加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
