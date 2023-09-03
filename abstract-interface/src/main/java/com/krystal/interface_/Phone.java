package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-02 22:40
 */
//Phone类 实现UsbInterface
//解读1.即Phone类需要实现UsbInterface接口 规定/声明的方法
public class Phone implements UsbInterface{

    @Override
    public void start() {
        System.out.println("手机开始工作");

    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");

    }
}
