package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-02 22:11
 */
public class Interface01 {
    public static void main(String[] args) {
        //创建手机、相机对象
        Phone phone = new Phone();
        Camera camera = new Camera();
        
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//把手机接入到计算机
        System.out.println("============");
        computer.work(camera);//把相机接入到计算机
    }

}
