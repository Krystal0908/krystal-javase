package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-02 22:44
 */
public class Computer {
    //编写一个方法,计算机开始工作
    //1. UsbInterface usbInterface 形参是接口类型 即 UsbInterface
    //2. 看到 接收 实现了UsbInterface 接口的类的对象实例
    public void work(UsbInterface usbInterface){
        //通过接口调用方法
        usbInterface.start();
        usbInterface.stop();
    }

}
