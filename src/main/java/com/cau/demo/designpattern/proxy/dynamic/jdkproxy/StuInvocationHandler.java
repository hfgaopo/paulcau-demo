package com.cau.demo.designpattern.proxy.dynamic.jdkproxy;

import com.cau.demo.designpattern.proxy.dynamic.MonitorUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * desc todo
 *
 * @author gaopo
 * @date 2018/10/10.
 */
public class StuInvocationHandler<T> implements InvocationHandler {

    private T target;

    public StuInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" + method.getName() + "方法");
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
