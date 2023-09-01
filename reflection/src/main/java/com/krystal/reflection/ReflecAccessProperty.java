package com.krystal.reflection;

import java.lang.reflect.Field;

/**
 * @author krystal
 * @create 2023-09-01 11:33
 */
//演示反射操作主方法
public class ReflecAccessProperty {
    public static void main(String[] args) throws Exception {
        //1.得到Student类对应的Class对象
        Class<?> stuClass = Class.forName("com.krystal.reflection.Student");
        //2.创建对象
        Object o = stuClass.newInstance();//o的运行类型就是student
        System.out.println(o.getClass());//Student
        //3.使用反射得到age属性对象
        Field age = stuClass.getField("age");
        age.set(o,88);//通过反射操作属性
        System.out.println(o);//age = 88
        System.out.println(age.get(o));//age = 88
        //4.使用反射操作name属性
        Field name = stuClass.getDeclaredField("name");
        //对name进行爆破,可以操作private属性
        name.setAccessible(true);
        name.set(o,"krystal");
        name.set(null,"krystal~");//因为name是static属性，因此o 也是可以写null
        System.out.println(o);
        System.out.println(name.get(o));//静态非静态都可以用
        System.out.println(name.get(null));//静态属性才可以使用
    }
}

class Student {//类
    public int age;

    private static String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    public Student() {

    }
}
