package com.krystal.abstract_;

/**
 * @author krystal
 * @create 2023-09-02 20:53
 */
public class AbstractDetail01 {
    public static void main(String[] args) {
        //1.抽象类不能被实例化，即不能new 抽象类
        //new A();



    }
}

//2.抽象类不一定要包含abstract方法。也就是说，抽象类可以没有abstract方法，还
// 可以有实现方法
abstract class A{
    public void hi(){
        System.out.println("hi");
    }
}

//3.一旦类包含了abstract方法，则这个类必须声明为abstract抽象类
abstract class B{
    public abstract void hi();
}

//4.abstract 只能修饰类和方法，不能修饰属性和其他的
class C{
//    public abstract int age = 10;
}