package com.krystal.reflection;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-08-31 10:53
 */
//演示如何通过反射获取类的结构信息
public class ReflectionUtils {
    public static void main(String[] args) {
        A a = new A();
        a.hi();

    }

    //第一组API
    @Test
    public void api_01() throws Exception {
        //得到Class对象
        Class<?> personCls = Class.forName("com.krystal.reflection.Person");
//        1.getName:获取全类名
        System.out.println(personCls.getName());//com.krystal.reflection.Person
//        2. getSimpleName:获取简单类名
        System.out.println(personCls.getSimpleName());
//        3.getFields:获取所有public修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println("本类以及父类的属性："+field.getName());
        }
//        4. getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("本类的所有属性："+field.getName());
        }
//        5.getMethods:获取所有public修饰的方法，包含本类以及父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类以及父类的所有方法：" + method.getName());
        }
//        6. getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法:" + declaredMethod.getName());
        }
//        7. getConstructors:获取本类所有public修饰的构造器
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类所有public修饰的构造器:" + constructor.getName());
        }
//        8. getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有构造器"+declaredConstructor.getName());
        }
//        9. getPackage:以Package形式返回 包信息
        System.out.println(personCls.getPackage());//package com.krystal.reflection
//        10.getSuperClass:以Class形式返回父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println("父类的class对象"+superclass);//class com.krystal.reflection.A
//        11.getinterfaces:以Class[]形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息"+ anInterface);
        }
//        12.getAnnotations:以Annotation[]形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息：" + annotation);
        }
    }
}
class A{
    public String hobby;

    public A(){

    }

    public void hi(){
        System.out.println("我是A类的方法");
    }
}

interface IA{

}

interface IB{

}
@Deprecated
class Person extends A implements IA,IB{
    //属性
    public String name;

    protected  int age;

    String job;

    private double sal;

    //构造器
    public Person(){

    }

    private Person(String name,int age){

    }

    public Person(String name){

    }

    //方法
    public void m1(){

    }
    protected void m2(){

    }
    void m3(){

    }
    private void m4(){

    }
}