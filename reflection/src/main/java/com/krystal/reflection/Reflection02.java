package com.krystal.reflection;

import com.krystal.Cat;

import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-08-30 9:37
 */
//测试反射调用的性能和优化方案
public class Reflection02 {
    public static void main(String[] args) throws Exception {

            m1();

            m2();

            m3();

    }

    //传统方法调用hi所花时间
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 900000000 ; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();

        System.out.println("m1()    传统方法调用hi 耗时="+(end-start));
    }

    //反射调用方法hi所花时间
    public static void m2() throws Exception {
        Class cls = Class.forName("com.krystal.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");

        long start = System.currentTimeMillis();
        for (int i = 1; i <= 900000000 ; i++) {
            hi.invoke(o);//反射调用
        }
        long end = System.currentTimeMillis();

        System.out.println("m1()    反射调用方法hi所花时间="+(end-start));
    }

    //反射调用优化：关闭访问检查
    public static void m3() throws Exception {
        Class cls = Class.forName("com.krystal.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");

        hi.setAccessible(true);//在反射调用方法时，取消访问检查

        long start = System.currentTimeMillis();
        for (int i = 1; i <= 900000000 ; i++) {
            hi.invoke(o);//反射调用
        }
        long end = System.currentTimeMillis();

        System.out.println("m3()   反射调用方法hi所花时间="+(end-start));
    }

}
