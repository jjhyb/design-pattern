package com.yibo.designpattern.structural.facade;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 20:00
 * @Description:
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNum = "666";
        return shippingOrderNum;
    }
}
