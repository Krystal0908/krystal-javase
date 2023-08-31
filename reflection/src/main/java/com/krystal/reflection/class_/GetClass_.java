package com.krystal.reflection.class_;

import com.krystal.Car;

/**
 * @author krystal
 * @create 2023-08-30 15:30
 */
//演示得到Class对象的各种方式（6种）
public class GetClass_ {
    public static void main(String[] args) throws Exception {
        //1.Class.forName 应用场景：多用于配置文件，读取类全路径加载类
        //代码阶段/编译阶段
        String classAllPath = "com.krystal.Car";//通过读取配置文件获取
        Class cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        //2.类名.class 应用场景：用于参数传递
        //Class类加载阶段
        Class<Car> cls2 = Car.class;
        System.out.println(Car.class);

        //3.通过对象.getClass(),应用场景：有对象实例
        //Runtime运行阶段
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3);

        //4.通过类加载器(4种)来获取
        //(1).先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2).通过类加载器得到Class对象
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //cls1,cls2,cls3,cls4是同一个对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        /*5.基本数据(int, char,boolean,float,double,byte,long,short)
        按如下方式得到 Class 类对象
        */
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);//int

        //6.基本数据类型对应的包装类，可以通过.TYPE得到Class类对象
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE;//其他包装类BOOLEAN，DOUBLE，LONG，等
        System.out.println(type1);
        System.out.println(type2);

        System.out.println(integerClass.hashCode());//同一个
        System.out.println(type1.hashCode());//同一个

    }
}
