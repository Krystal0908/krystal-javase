package com.krystal.reflection.class_;

import com.krystal.Dog;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author krystal
 * @create 2023-08-30 16:33
 */
public class ClassLoad_ {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入key");
        String key = scanner.next();

        switch (key){
            case "1":
                Dog dog = new Dog();//静态加载，在编译的时候就检查该类有没有，没有则报错，依赖性很强
                dog.cry();
                break;
            case "2":

                //反射--> 动态加载
                //动态加载，在编译的时候不会加载该类，即使不存在也不会保错，在运行的时候执行到该行代码时才会加载该类，降低了依赖性
                Class<?> person = Class.forName("Person");
                Object o = person.newInstance();
                Method method = person.getMethod("hi");
                method.invoke(o);

                System.out.println("ok");
                break;
            default:
                System.out.println("do nothing...");
        }
    }
}


