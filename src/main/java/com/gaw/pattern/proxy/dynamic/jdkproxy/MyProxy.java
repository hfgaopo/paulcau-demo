package com.gaw.pattern.proxy.dynamic.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * desc todo
 *
 * @author gaopo
 * @date 2018/10/10.
 */
public class MyProxy {

    public static void main(String[] args) {
        Person person = new Student("测试xxx");
        InvocationHandler stuHandler = new StuInvocationHandler<>(person);
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);
        stuProxy.giveMoney();
    }
}
