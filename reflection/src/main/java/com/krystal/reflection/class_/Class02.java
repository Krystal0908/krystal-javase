package com.krystal.reflection.class_;

import com.krystal.Car;

import java.lang.reflect.Field;

/**
 * @author krystal
 * @create 2023-08-30 12:59
 */
//演示Class类的常用方法
public class Class02 {
    public static void main(String[] args) throws Exception {
        String classAllPath = "com.krystal.Car";
        //1.获取Car类对应的Class对象
        //<？>表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);
        //2.输出cls
        System.out.println(cls);//显示cls对象，是哪个类的Class对象： com.krystal.Car
        System.out.println(cls.getClass());//输出cls运行类型：java.lang.Class
        //3.得到包名
        System.out.println(cls.getPackage().getName());//包名
        //4.得到类名
        System.out.println(cls.getName());//全类名
        //5.通过cls创建对象实例
        Car car = (Car)cls.newInstance();
        System.out.println(car);//car.toString()
        //6.通过反射获取属性(public 属性)
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));//阿维塔11
        //7.通过反射给属性赋值
        brand.set(car,"阿维塔11");
        System.out.println(brand.get(car));//阿维塔12
        //8.遍历到所有字段属性
        System.out.println("=============所有的字段属性===============");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());//名称
        }

    }
}

