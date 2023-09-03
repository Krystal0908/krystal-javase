package com.krystal.static_proxy.shangjia;

import com.krystal.static_proxy.factory.UsbKingFactory;
import com.krystal.static_proxy.service.UsbSell;

/**
 * @author krystal
 * @create 2023-09-03 17:25
 */
public class PinDuoDuo  implements UsbSell {

    //代理的是U盘，定义目标厂家类
    private UsbKingFactory factory = new UsbKingFactory();
    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = factory.sell(amount);
        //只增加1元
        price = price + 1;

        return price;
    }
}
