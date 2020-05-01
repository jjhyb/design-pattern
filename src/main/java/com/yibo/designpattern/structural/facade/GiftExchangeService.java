package com.yibo.designpattern.structural.facade;

/**
 * @author: huangyibo
 * @Date: 2020/4/24 20:03
 * @Description:
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if(pointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNum = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是："+shippingOrderNum);
            }
        }
    }
}
