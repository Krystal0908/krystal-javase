package com.krystal.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-09-01 15:41
 */

public class Homework01 {
    public static void main(String[] args) throws Exception {
        /**
         * 1.定义PrivateTest类，有私有name属性，并且属性值为hellokitty
         * 2.提供getName的公有方法
         * 3.创建PrivateTest的类，利用Class类得到私有的name属性，修改私有的name属性值，
         * 并调用getName()的方法打印name属性值
         */

        //1.得到PrivateTest类对应的Class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2.创建一个对象实例
        PrivateTest privateTestObj = privateTestClass.newInstance();
        //3.得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");
        //4.爆破
        name.setAccessible(true);
        name.set(privateTestObj,"天龙八部");
        //5.得到getName方法对象
        Method getName = privateTestClass.getMethod("getName");
        //6.因为getName() 是public，所以可以直接调用
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name属性值"+invoke);

    }
}

class PrivateTest {
    private String name = "hellokitty";

    //有一个默认的无参构造器
    public String getName() {
        return name;
    }
}
