package com.krystal.reflection;

import java.lang.reflect.Constructor;

/**
 * @author krystal
 * @create 2023-08-31 17:02
 */
//演示通过反射机制创建实例
public class ReflecCreateInstance {
    public static void main(String[] args) throws Exception {
        //1.获取到User类的Class对象
        Class<?> userClass = Class.forName("com.krystal.reflection.User");

        //2.通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);

        //3.通过public的有参构造器创建实例
        /*
            constructor对象就是
             public User(String name) {//public的有参构造器
                this.name = name;
            }

         */
        //3.1 先得到对应的构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //3.2 创建实例，并传入实参
        Object instance = constructor.newInstance("阿维塔12");
        System.out.println("instance"+instance);

        //4.通过非public的有参构造器创建实例
        //4.1 先得到private的构造器对象
        Constructor<?> declaredConstructor = userClass.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例
        declaredConstructor.setAccessible(true);//爆破（暴力破解）：使用反射可以访问private构造器
        //反射面前都是纸老虎，私有的 构造器、方法、属性都可以访问
        Object user2 = declaredConstructor.newInstance(100, "张三丰");
        System.out.println("user2"+user2);

    }
}

//User类
class User{
    private int age = 10;

    private String name = "krystal";

    //无参 public
    public User(){

    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}