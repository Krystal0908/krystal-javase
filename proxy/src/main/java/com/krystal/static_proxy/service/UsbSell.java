package com.krystal.static_proxy.service;

/**
 * @author krystal
 * @create 2023-09-03 16:27
 */
//表示功能，厂家，商家都要完成的功能
public interface UsbSell {
    //定义方法 参数 amount：表示一次购买的数量，暂时不用
    //返回值表示一个u盘的价格
    float sell(int amount);

    //可以定义多个其他方法
}
