package com.krystal.dynamic_proxy;

import com.krystal.dynamic_proxy.factory.UsbKingFactory;
import com.krystal.dynamic_proxy.handler.MySellHandler;
import com.krystal.dynamic_proxy.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author krystal
 * @create 2023-09-03 21:52
 */
public class MainShop {
    public static void main(String[] args) {
        //创建代理对象，使用Proxy
        //1.创建目标对象
        //UsbKingFactory factory = new UsbKingFactory();
        //有接口时使用接口接收
        UsbSell factory = new UsbKingFactory();
        //2.创建InvovcationHandler对象
        InvocationHandler handler = new MySellHandler(factory);
        //3.创建代理对象

        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                handler);
        //4.通过代理执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法,商品价格为："+price);
    }
}
