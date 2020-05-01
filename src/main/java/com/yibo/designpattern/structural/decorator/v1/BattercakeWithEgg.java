package com.yibo.designpattern.structural.decorator.v1;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 22:15
 * @Description:
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc()+"，加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
