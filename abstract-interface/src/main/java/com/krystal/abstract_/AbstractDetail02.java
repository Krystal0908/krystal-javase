package com.krystal.abstract_;

/**
 * @author krystal
 * @create 2023-09-02 21:01
 */
public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

//5.抽象类的本质还是类，所以可以有类的各种成员
abstract class D {
    public static String name = "krystal";
    private int n1 = 10;

    public static void ok() {
        System.out.println("ok");
    }

    public void hi() {
        System.out.println("hi");
    }

    //6.抽象方法不能有主体
    public abstract void hello();
}

//7.如果一个类继承了抽象类，则它必须实现抽象类中的所有抽象方法，除非它自己声明为一个abstract抽象类
abstract class E {
    public abstract void hi();
}

abstract class F extends E {

}

class G extends E{

    @Override
    public void hi() {
        System.out.println("hi");//这里相当于G子类实现了父类的抽象方法
    }
}

//8.抽象方法不能使用private、final、static来修饰，因为这些关键字都是和重写相违背的
abstract class H{
//    public final abstract void hi();
//    private final abstract void hi();
//    public static abstract void hi();
    public abstract void hi();
}