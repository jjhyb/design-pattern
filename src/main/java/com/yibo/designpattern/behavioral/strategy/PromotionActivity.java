package com.yibo.designpattern.behavioral.strategy;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 19:28
 * @Description:
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
