package com.krystal.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author krystal
 * @create 2023-08-30 9:17
 */
public class Reflection01 {
    public static void main(String[] args) throws Exception {
        //1.使用Properties类，可以读写配置文件
        Properties properties = new Properties();
        //krystal_PC
        //properties.load(new FileInputStream("D:\\Study\\Git-Space\\Gitee\\krystal-javase\\reflection\\src\\main\\resources\\re.properties"));
        //WTG_PC
        properties.load(new FileInputStream("D:\\Git-Space\\Git-Test\\krystal-javase\\reflection\\src\\main\\resources\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();//"com.krystal.Cat" 字符串 不是类的全路径
        String methodName = properties.get("method").toString();//  "hi"

        //3.使用反射机制解决
        //(1).加载类
        Class<?> cls = Class.forName(classfullpath);
        //(2).通过    cls 得到你加载的类，com.krystal.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型="+ o.getClass());//运行类型
        //（3）.通过 cls 得到你加载的类 com.krysatl.Cat的   methodName:”hi“ 的方法对象
        //在放射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(methodName);
        //(4).通过method1调用方法：即通过方法对象来实现调用方法
        System.out.println("====================");
        method1.invoke(o);//传统方法    对象.方法(),反射机制  方法.invoke(对象)

        //
        //得到name字段,getField()不能得到私有的属性
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));//传统写法 对象.成员变量 ，反射： 成员变量对象.get（对象）

        //getConstructor()获取构造器
        Constructor<?> constructor = cls.getConstructor();//
        System.out.println(constructor);


        Constructor<?> constructor2 =cls.getConstructor(String.class);//String.class就是String类的Class对象
        System.out.println(constructor2);

    }


}
