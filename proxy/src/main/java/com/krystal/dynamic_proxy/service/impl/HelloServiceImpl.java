package com.krystal.dynamic_proxy.service.impl;

import com.krystal.dynamic_proxy.service.HelloService;

/**
 * @author krystal
 * @create 2023-09-03 18:31
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        System.out.println("你好："+name);
    }
}
