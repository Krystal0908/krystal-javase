package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-03 9:48
 */
public class InterfaceDetail02 {
    public static void main(String[] args) {
        //接口中的属性是 public static final
        //7.接口中属性的访问形式：接口名.属性名
        System.out.println(IB.n1);//说明n1 就是static
        //IB.n1 = 30; 说明n1 就是final，不可修改的


    }
}

interface IB{
    //6.接口中的属性，只能是final的，而且是 public static final 修饰符
    int n1 = 10;//等价 public static final int n1 = 10；
    void hi();
}

interface IC{
    void say();
}

//8.接口不能继承其他的类，但是可以继承多个别的接口
interface ID extends IB,IC{

}

//9.接口的修饰符 只能是 public 或默认，这点和类的修饰符石一样的
interface IE{

}

//5.一个类可以同时实现多个接口
class Pig implements IB,IC{

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}

