package com.yibo.designpattern.behavioral.strategy;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 19:24
 * @Description:
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去优惠价格");
    }
}
