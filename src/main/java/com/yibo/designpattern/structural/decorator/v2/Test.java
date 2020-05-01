package com.yibo.designpattern.structural.decorator.v2;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 22:48
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggSausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+" 销售价格："+aBattercake.cost());
    }
}
