package com.krystal.abstract_;

/**
 * @author krystal
 * @create 2023-09-02 21:51
 */
//抽象类-模板设计模式
public abstract class Template {
    public abstract void job();//抽象方法

    public void calcTime() {
        // 开始的时间
        long start = System.currentTimeMillis();
        job();
        // 结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间"+ (end-start));

    }
}
