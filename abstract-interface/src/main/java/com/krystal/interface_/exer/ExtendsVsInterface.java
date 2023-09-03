package com.krystal.interface_.exer;

/**
 * @author krystal
 * @create 2023-09-03 10:09
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("悟空");
        wuKong.climbing();
        wuKong.swimming();
        wuKong.flying();
    }
}

//猴子
class Monkey{
    private String name;
    public void climbing(){
        System.out.println(name+"会爬树...");
    }

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//鱼接口
interface Fishable{
    void swimming();
}
//鸟接口
interface Bridable{
    void flying();
}
//继承
//小结： 当子类继承了父类，就自动的拥有父类的功能
//      如果子类需要扩展功能，可以通过实现接口的方式扩展
//      可以理解 实现接口 是 对java单继承机制的一种补充
//      继承的价值主要在于：解决代码的复用性和可维护性
//      接口的价值主要在于：设计，设计好各种规范（方法），让其他类去实现这些方法
class LittleMonkey extends Monkey implements Fishable,Bridable{

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习，可以像鱼儿一样游泳...");
    }

    @Override
    public void flying() {
        System.out.println(getName()+"通过学习，可以像鸟儿一样飞行...");
    }
}

