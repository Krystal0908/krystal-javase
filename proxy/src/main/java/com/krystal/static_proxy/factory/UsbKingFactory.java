package com.krystal.static_proxy.factory;

import com.krystal.static_proxy.service.UsbSell;

/**
 * @author krystal
 * @create 2023-09-03 16:30
 */
//目标类：u盘厂家,不接受用户的单独购买
public class UsbKingFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        System.out.println("目标类中的方法调用，usbKingFactory 中的sell");
        //一个128G的u盘是 85元
        //后期根据amount，可以实现不同的价格，例如10000个单价80元，50000个单价75元
        return 85.0f;
    }
}
