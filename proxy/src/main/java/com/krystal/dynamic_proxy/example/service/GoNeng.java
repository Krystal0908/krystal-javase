package com.krystal.dynamic_proxy.example.service;

import com.krystal.dynamic_proxy.example.HelloService;

/**
 * @author krystal
 * @create 2023-09-03 22:25
 */
public class GoNeng implements HelloService {
    @Override
    public int print(String name) {
        System.out.println("其他人写好的功能方法");
        return 2;
    }
}
