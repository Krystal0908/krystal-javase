package com.krystal.abstract_;

/**
 * @author krystal
 * @create 2023-09-02 21:34
 */
public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calcTime();

        System.out.println("============");
        BB bb = new BB();
        bb.calcTime();
    }
}


class AA extends Template{
    //计算任务
    //1+2+...+10亿
//
//    public void calcTime() {
//        // 开始的时间
//        long start = System.currentTimeMillis();
//        job();
//        // 结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("AA执行时间"+ (end-start));
//
//    }

    public void job(){
//        //开始的时间
//        long start = System.currentTimeMillis();

        int num = 0;
        for (int i = 1; i <= 1000000000; i++) {//10亿
            num += i;
        }
//        // 结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间"+ (end-start));
    }
}

class BB extends Template{
    //计算任务
    //1+2+...+10亿
//    public void calcTime() {
//        // 开始的时间
//        long start = System.currentTimeMillis();
//        job();
//        // 结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("BB执行时间"+ (end-start));
//
//    }
    public void job(){
//        //开始的时间
//        long start = System.currentTimeMillis();

        long num = 0;
        for (int i = 1; i <= 1000000000; i++) {//10亿
            num *= i ;
        }
//        // 结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间"+ (end-start));
    }
}