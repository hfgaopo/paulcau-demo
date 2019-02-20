package com.gaw.demo.pattern.proxy.dynamic.cglibproxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * desc todo
 *
 * @author gaopo
 * @date 2018/10/10.
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before代理拦截方法:" + method.getName());
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after代理拦截方法：" + method.getName());
        return result;
    }
}
