package com.krystal.reflection.class_;

import com.krystal.Cat;

/**
 * @author krystal
 * @create 2023-08-30 10:12
 */
//对Class类特点的梳理
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //看看Class类图
        //1.Class也是类，因此也是继承Object类
        //Class
        //2.Class类对象不是new出来的，而是系统创建的
        //(1).传统new对象

        /**ClassLoader类
         * public Class<?> loadClass(String name) throws ClassNotFoundException {
         *         return loadClass(name, false);
         *     }
         */
        Cat cat = new Cat();

        //(2).反射方式
        /*
            public Class<?> loadClass(String name) throws ClassNotFoundException {
         *         return loadClass(name, false);
         *     }
         */
        Class cls01 = Class.forName("com.krystal.Cat");

        //3.对于某个类的Class类对象。在内存中只有一份，因此类只加载一次
        Class cls02 = Class.forName("com.krystal.Cat");
        System.out.println(cls01.hashCode());
        System.out.println(cls02.hashCode());

        Class<?> cls03 = Class.forName("com.krystal.Dog");
        System.out.println(cls03.hashCode());
    }
}
