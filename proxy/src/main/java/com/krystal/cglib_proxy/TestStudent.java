package com.krystal.cglib_proxy;

import com.krystal.cglib_proxy.interceptor.CglibInterceptor;
import com.krystal.cglib_proxy.service.IStudentService;
import com.krystal.cglib_proxy.service.impl.StudentServiceImpl;
import com.krystal.cglib_proxy.transaction.DaoTransaction;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author krystal
 * @create 2023-09-05 23:48
 */
public class TestStudent {

    @Test
    public void testSave(){
        //生成代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:\\Study\\Git-Space\\Gitee\\krystal-javase\\proxy\\src\\main\\java\\com\\krystal\\cglib_proxy\\generator");
        //得到方法拦截器
        CglibInterceptor interceptor = new CglibInterceptor(new DaoTransaction());
        //使用CGLIB框架生成目标类的子类（代理类）实现增强
        Enhancer enhancer = new Enhancer();
        //设置父类字节码
        enhancer.setSuperclass(StudentServiceImpl.class);
        //设置拦截处理
        enhancer.setCallback(interceptor);
        IStudentService service = (IStudentService)enhancer.create();
        service.save(new Student());
    }
}
