package com.krystal.cglib_proxy.transaction;

/**
 * @author krystal
 * @create 2023-09-05 23:42
 */
public class DaoTransaction {
    public void before(){
        System.out.println("开启事务操作");
    }

    public void after(){
        System.out.println("关闭事务操作");
    }
}
