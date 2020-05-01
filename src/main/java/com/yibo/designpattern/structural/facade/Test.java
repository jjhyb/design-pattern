package com.yibo.designpattern.structural.facade;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 20:08
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
