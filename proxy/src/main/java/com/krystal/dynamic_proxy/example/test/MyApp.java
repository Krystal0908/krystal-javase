package com.krystal.dynamic_proxy.example.test;

import com.krystal.dynamic_proxy.example.HelloService;
import com.krystal.dynamic_proxy.example.handler.MyInvocationHandler;
import com.krystal.dynamic_proxy.example.service.GoNeng;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author krystal
 * @create 2023-09-03 22:26
 */
public class MyApp {
    public static void main(String[] args) {
//        GoNeng gn = new GoNeng();
//        int num = gn.print("销售");
//        System.out.println("num" + num);

        GoNeng goNeng = new GoNeng();
        InvocationHandler handler = new MyInvocationHandler(goNeng);

        HelloService proxy = (HelloService) Proxy.newProxyInstance(goNeng.getClass().getClassLoader(),
                goNeng.getClass().getInterfaces(),
                handler);

        int num = proxy.print("市场");
        System.out.println("我们期望的 num=="+num);
    }
}
