package com.krystal;

import javax.naming.Name;

/**
 * @author krystal
 * @create 2023-08-29 23:23
 */
public class Cat {

    private String name = "招财猫";
    public int age = 10;//共有的变量

    public Cat(){

    }
    public Cat(String name){
        this.name = name;
    }

    public void hi(){
//        System.out.println("hi" + name);
    }

    public void cry(){
//        System.out.println(name + "喵喵叫。。。");
    }
}
