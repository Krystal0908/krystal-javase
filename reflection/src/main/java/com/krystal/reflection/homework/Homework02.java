package com.krystal.reflection.homework;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-09-01 15:51
 */
public class Homework02 {
    public static void main(String[] args) throws Exception {
        /**
         * 1.利用Class类的forName方法得到File类的class对象
         * 2.在控制台打印File类的所有构造器
         * 3.通过newlnstance的方法创建File对象，并创建E:\mynew.txt文件
         */
        //1.利用Class类的forName方法得到File类的class对象
        Class<?> fileCls = Class.forName("java.io.File");
        //2.得到所有的构造器
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File构造器="+declaredConstructor);
        }
        //3.指定得到public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String fileAllPath = "d:\\mynew.txt";//还在内存中
        Object file = declaredConstructor.newInstance(fileAllPath);//创建File对象

        //4.得到createNewFile 的方法对象
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);//创建文件，调用的是得到createNewFile
        //file的运行类型就是File
        System.out.println(file.getClass());
        System.out.println("创建文件成功"+fileAllPath);

    }
}
