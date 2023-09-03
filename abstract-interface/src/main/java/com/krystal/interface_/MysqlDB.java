package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-03 0:01
 */
//A程序员
public class MysqlDB implements DBInterface{

    @Override
    public void connect() {
        System.out.println("连接MySQL");
    }

    @Override
    public void close() {
        System.out.println("关闭MySQL");
    }
}
