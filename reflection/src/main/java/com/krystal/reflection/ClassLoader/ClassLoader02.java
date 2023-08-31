package com.krystal.reflection.ClassLoader;

/**
 * @author krystal
 * @create 2023-08-31 9:33
 */
public class ClassLoader02 {
    public static void main(String[] args) {

    }
}

class A {
    //属性-成员变量-字段
    /**
     * 1.n1是一个实例属性，不是一个静态变量。因此在准备阶段是不会分配内存
     * 2.n2是静态变量，会分配内存，n2是默认初始化为 0，而不是 20
     * 3.n3是static final 是常量，它和静态变量不一样，因为一旦赋值就不变了 n3 = 30
     */
    public int n1 = 10;
    public static int n2 = 20;
    public static final int n3 = 30;
}


