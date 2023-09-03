package com.krystal.dynamic_proxy.test;

import com.krystal.dynamic_proxy.service.impl.HelloServiceImpl;
import com.krystal.dynamic_proxy.service.impl.HelloServiceImpl02;

import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-09-03 18:36
 */
public class TestApp {
    public static void main(String[] args) throws Exception {
//        HelloServiceImpl service = new HelloServiceImpl();
//        service.sayHello("张三");

        //使用反着机制执行sayHello方法。核心Method（类中的方法）
        HelloServiceImpl target = new HelloServiceImpl();
        //获取sayHello名称对应的Method类对象
        Method method = HelloServiceImpl.class.getMethod("sayHello", String.class);
        /*
            invoke()是Method类中的一个方法。表示执行方法的调用
            参数：
                1.Object，表示对象的，要执行这个对象的方法
                2.Object...args，表示方法执行时的参数值
                返回值：
                Object：表示方法执行后的返回值
         */
        //执行target对象sayHello方法，参数是 “李四”
        Object ret = method.invoke(target, "李四");

        HelloServiceImpl02 helloServiceImpl02 = new HelloServiceImpl02();
        Method method02 = HelloServiceImpl02.class.getMethod("sayHello", String.class);
        Object wangwu = method02.invoke(helloServiceImpl02, "wangwu");


    }
}
