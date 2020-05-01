package com.yibo.designpattern.structural.facade;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 19:59
 * @Description:
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+"，积分成功");
        return true;
    }
}
