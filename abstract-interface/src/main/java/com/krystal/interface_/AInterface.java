package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-02 23:23
 */
public interface AInterface {
    //写属性
    public int n1 = 10;
    //写方法(1.抽象方法 2.默认实现方法 3.静态方法)

    //在接口中，抽象方法，可以省略abstract关键字
    public void hi();
    //在jdk8后，可以有默认实现方法，需要使用default关键字
    default public void ok(){
        System.out.println("ok");
    }
    //在jdk8后，可以有静态方法
    public static void cry(){
        System.out.println("cry");
    }
}
