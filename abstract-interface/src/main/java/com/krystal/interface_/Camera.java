package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-02 22:43
 */
//实现接口，就是把接口的方法实现
public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
