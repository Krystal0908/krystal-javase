package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-03 0:58
 */
public class InterfaceDetail01 {
    public static void main(String[] args) {
//        new IA();
    }
}

//1.接口不能被实例化
//2.接口中所有的方法是public方法，接口抽象方法，可以不用abstract修饰,
// 即可以同时省略public abstract
interface IA{
    public abstract void say();
    void hi();
}

//3.一个普通类实现接口，就必须将该接口的所有方法都实现
class Cat implements IA{

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
//4.抽象类实现接口时，可以不用实现接口的方法
abstract class Tiger implements IA{

}
