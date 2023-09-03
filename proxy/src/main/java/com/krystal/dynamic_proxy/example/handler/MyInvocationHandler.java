package com.krystal.dynamic_proxy.example.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-09-03 22:28
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1.调用目标方法，执行print（）得到2
        Object res = method.invoke(target, args);//2.

        //需要乘以2的结果
        if(res != null){
            Integer num = (Integer) res;
            res = num * 2;
        }
        return res;
    }
}
