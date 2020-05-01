package com.yibo.designpattern.behavioral.strategy;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 19:24
 * @Description:
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到用户余额中");
    }
}
