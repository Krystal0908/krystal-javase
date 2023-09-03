package com.krystal.interface_;

/**
 * @author krystal
 * @create 2023-09-03 0:36
 */
public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }
    
    public static void t(DBInterface db){
        db.connect();
        db.close();
    }
}
