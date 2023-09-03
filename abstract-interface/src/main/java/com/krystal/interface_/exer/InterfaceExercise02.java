package com.krystal.interface_.exer;

/**
 * @author krystal
 * @create 2023-09-03 11:37
 */
public class InterfaceExercise02 {
    public static void main(String[] args) {
        new C().pX();
    }
}

interface AA{
    int x = 0;//等价于 public static final int x = 0;
}

class BB{
    int x = 1;
}

class C extends BB implements AA{
    public void pX(){
//        System.out.println(x);错误，原因不明确x
        //访问接口的 x 就使用 AA.x
        System.out.println(AA.x);
        //访问父类的 x 就使用 super.x
        System.out.println(super.x);
    }

}
