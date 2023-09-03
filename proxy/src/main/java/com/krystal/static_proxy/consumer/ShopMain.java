package com.krystal.static_proxy.consumer;

import com.krystal.static_proxy.shangjia.PinDuoDuo;
import com.krystal.static_proxy.shangjia.TaoBao;

/**
 * @author krystal
 * @create 2023-09-03 16:41
 */
public class ShopMain {
    public static void main(String[] args) {
        //创建代理的商家taobao对象
        //通过代理类，实现购买u盘，增加优惠券等功能
        TaoBao taoBao = new TaoBao();
        float price01 = taoBao.sell(1);
        System.out.println("通过淘宝的商家，购买u盘单价：" + price01);

        //通过代理类，实现购买u盘，增加优惠券等功能
        PinDuoDuo pin = new PinDuoDuo();
        float price02 = pin.sell(1);
        System.out.println("通过拼多多购买的价格："+price02);
    }
}
