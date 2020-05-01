package com.yibo.designpattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: huangyibo
 * @Date: 2020/4/26 19:39
 * @Description:
 */
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> promotionStrategyMap = new HashMap<>();

    private static final EmptyPromotionStrategy emptyPromotionStrategy = new EmptyPromotionStrategy();

    static{
        promotionStrategyMap.put(PromotionKey.LIJIAN,new LiJianPromotionStrategy());
        promotionStrategyMap.put(PromotionKey.FANXIAN,new FanXianPromotionStrategy());
        promotionStrategyMap.put(PromotionKey.MANJIAN,new ManJianPromotionStrategy());
    }

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = promotionStrategyMap.get(promotionKey);
        return promotionStrategy == null ? emptyPromotionStrategy : promotionStrategy;
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
    }
}
