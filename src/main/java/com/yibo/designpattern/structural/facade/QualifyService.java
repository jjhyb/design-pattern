package com.yibo.designpattern.structural.facade;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 19:56
 * @Description:
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验："+pointsGift.getName()+"，积分资格通过，库存通过");
        return true;
    }
}
