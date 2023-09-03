package com.krystal.static_proxy.shangjia;

import com.krystal.static_proxy.factory.UsbSanFactory;
import com.krystal.static_proxy.service.UsbSell;

/**
 * @author krystal
 * @create 2023-09-03 16:34
 */
//淘宝是一个商家，代理u盘的销售
public class TaoBaoSanDi implements UsbSell {
    //声明 商家代理的厂家具体是谁
    private UsbSanFactory factory = new UsbSanFactory();

    @Override
    //实现销售u盘的功能
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家，我要买u盘，厂家发货
        float price = factory.sell(amount);
        //商家 需要加价，也就是代理要增加价格
        price = price + 25;//增强功能，代理类在完成目标类方法调用后，增强了功能
        //在目标类的方法调用后，你做的其他功能，都是增强的意思
        System.out.println("taobao商家，给你返回一个优惠券，或者红包");

        //增加的价格
        return price;
    }
}
