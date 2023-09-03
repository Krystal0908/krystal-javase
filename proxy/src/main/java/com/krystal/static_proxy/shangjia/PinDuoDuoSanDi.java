package com.krystal.static_proxy.shangjia;

import com.krystal.static_proxy.factory.UsbSanFactory;
import com.krystal.static_proxy.service.UsbSell;

/**
 * @author krystal
 * @create 2023-09-03 17:25
 */
public class PinDuoDuoSanDi implements UsbSell {

    //代理的是U盘，定义目标厂家类
    private UsbSanFactory factory = new UsbSanFactory();
    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = factory.sell(amount);
        //只增加1元
        price = price + 1;

        return price;
    }
}
