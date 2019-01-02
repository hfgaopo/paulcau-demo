package com.cau.demo.designpattern.singleton;

/**
 * desc 饿汉式
 *
 * @author gaopo
 * @date 2018/12/28.
 */
public class Singleton_innerClass {

    private static SingleInstance singleInstance;

    public static SingleInstance getSingleInstance() {
        return InnerClass.singleInstance;
    }

    static class InnerClass {
        public static SingleInstance singleInstance = new SingleInstance();
    }
}
