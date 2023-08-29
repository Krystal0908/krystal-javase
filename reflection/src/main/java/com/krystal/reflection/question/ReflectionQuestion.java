package com.krystal.reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author krystal
 * @create 2023-08-29 23:26
 * 反射问题的引入
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.properties 指定信息，创建Cat对象并调用方法hi
        
        //传统方法 new 对象 -> 调用方法
        /*Cat cat = new Cat();
        cat.hi();*/
        //cat.hi() ==> cat.cry()

        //我们尝试做一下   -> 明白反射

        //1.使用Properties类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\Study\\Git-Space\\Gitee\\krystal-javase\\reflection\\src\\main\\resources\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();//"com.krystal.Cat" 字符串 不是类的全路径
        String methodName = properties.get("method").toString();//  "hi"
        System.out.println("classfullpath:"+classfullpath);
        System.out.println("method:"+methodName);

        //2.创建对象，传统方法行不通 ==》放射
        //new classfullpath();

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

    }
    
}
