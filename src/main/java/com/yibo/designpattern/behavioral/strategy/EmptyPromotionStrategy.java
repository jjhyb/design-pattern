package com.yibo.designpattern.behavioral.strategy;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 19:43
 * @Description:
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
