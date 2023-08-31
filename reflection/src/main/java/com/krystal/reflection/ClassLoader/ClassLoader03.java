package com.krystal.reflection.ClassLoader;

/**
 * @author krystal
 * @create 2023-08-31 10:13
 */
//演示类加载-初始化阶段
public class ClassLoader03 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.加载B类，并生成B的Class对象
        //2.连接  num = 0
        //3.初始化阶段，依次自动收集类中所有静态变量的赋值动作和静态代码块中的语句,并合并
        /*
                clinit() {
                    System.out.println("B的静态代码块被执行");
                    合并之后：//num = 300;
                    num = 100;
                }
                合并： num = 100;
         */
        //4.  B b = new B();   "B 的构造器被执行"


        System.out.println(B.num);//100,如果直接使用类的静态属性，也会导致类的加载

        //看看加载类的时候，是有同步机制控制
        /*
        protected Class<?> loadClass(String name,boolean resolve) throws ClassNotFoundException{
            //正因为有这个机制，才能保证某一个类在内存中只有一份Class对象
            synchronized (getClassLoadingLock(name)){
            //...
            }
        }
         */
        B b = new B();//类加载也会合并

    }


}



class B{
    static {
        System.out.println("B   的静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B(){
        System.out.println("B 的构造器被执行");
    }
}
