package com.krystal.dynamic_proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-09-03 21:45
 */
//必须实现InvocationHandler接口，完成代理类要做的功能
    //1.调用目标方法  2.功能增强
public class MySellHandler implements InvocationHandler {
    private Object target = null;

    //动态代理：目标对象是活动的，不是固定的，需要传入进来
    public MySellHandler(Object target) {
        //给目标对象赋值
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        //向厂家发送订单，告诉厂家，我要买u盘，厂家发货
//        float price = factory.sell(amount);
        //执行目标方法
        res = method.invoke(target,args);

        //商家 需要加价，也就是代理要增加价格
        if (res != null){
            Float price = (Float) res;
            price = price + 25;
            res = price;
        }
        //price = price + 25;增强功能，代理类在完成目标类方法调用后，增强了功能
        //在目标类的方法调用后，你做的其他功能，都是增强的意思
        System.out.println("taobao商家，给你返回一个优惠券，或者红包");

        //增加的价格
        return res;
    }
}
