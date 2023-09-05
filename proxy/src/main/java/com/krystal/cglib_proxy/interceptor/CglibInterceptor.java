package com.krystal.cglib_proxy.interceptor;

import com.krystal.cglib_proxy.transaction.DaoTransaction;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author krystal
 * @create 2023-09-05 23:41
 */
public class CglibInterceptor implements MethodInterceptor {
    
    DaoTransaction transaction;

    public CglibInterceptor(DaoTransaction transaction){
        this.transaction = transaction;
    }



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //事务增强
        transaction.before();
        Object ret = methodProxy.invokeSuper(o, objects);
        //事务增强
        transaction.after();

        return ret;
    }
}
