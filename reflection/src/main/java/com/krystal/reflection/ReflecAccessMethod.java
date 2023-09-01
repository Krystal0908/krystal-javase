package com.krystal.reflection;

import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-09-01 12:38
 */
//演示方法反射调用方法
public class ReflecAccessMethod {
    public static void main(String[] args) throws Exception {
        //1.得到Boss类对应的Class对象
        Class<?> bossCls = Class.forName("com.krystal.reflection.Boss");
        //2.创建对象
        Object o = bossCls.newInstance();
        //3.调用public的hi方法
//        Method hi = bossCls.getMethod("hi",String.class);
        //3.1得到hi方法对象
        Method hi = bossCls.getDeclaredMethod("hi",String.class);
        //3.2调用
        hi.invoke(o,"krystal");

        //4.调用private static方法
        //4.1得到say方法对象
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(0, 100, "krystal", '男'));
        //4.2因为say方法是static的，还可以这样调用，传入null
        System.out.println(say.invoke(null, 200, "lisi", '女'));

        //5.在反射中，如果方法有返回值，全部返回Object
        Object reVal = say.invoke(null, 300, "王五", '男');
        System.out.println("reval 的运行类型="+ reVal.getClass());
    }
}

class Monster {

}

class Boss {//类
    public int age;

    private static String name;

    public Boss() {//构造器
    }

    public Monster m1() {
        return new Monster();
    }

    private static String say(int n, String s, char c) {//静态方法
        return n + " " + s + " " + c;
    }

    public void hi(String s) {//普通 public 方法

        System.out.println("hi " + s);
    }
}
