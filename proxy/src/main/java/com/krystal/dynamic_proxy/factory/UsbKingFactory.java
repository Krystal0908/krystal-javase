package com.krystal.dynamic_proxy.factory;

import com.krystal.dynamic_proxy.service.UsbSell;

/**
 * @author krystal
 * @create 2023-09-03 21:43
 */
//目标类
public class UsbKingFactory implements UsbSell {
    @Override
    //目标方法
    public float sell(int amount) {
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }
}
