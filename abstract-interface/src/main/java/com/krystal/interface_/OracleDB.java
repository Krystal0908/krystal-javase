package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-03 0:18
 */
public class OracleDB implements DBInterface{

    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");

    }
}
