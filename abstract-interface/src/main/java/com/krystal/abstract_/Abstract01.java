package com.krystal.abstract_;

/**
 * @author krystal
 * @create 2023-09-01 17:15
 */
public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private  String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考：这里eat方法其实 没什么意义
    //即：父类方法不确定性的问题
    //===>考虑将该方法设计为抽象（abstract）方法
    //===>所谓抽象方法就是没有实现的方法
    //===>所谓没有实现就是指，没有方法体，即不能有{}
    /*public void eat(){
        System.out.println("这是一个动物，但是不知道吃什么");
    }*/
    //当一个类中存在抽象方法时，需要将该类声明为abstract类
    //===>抽象类会被继承，有其子类实现该抽象方法
    //抽象类的价值更多作用是在于设计，是设计者设计好后，让子类继承并实现抽象类（）
    public abstract void eat();

}