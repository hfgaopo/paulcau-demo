package com.gaw.pattern.singleton;

/**
 * desc 饿汉式
 *
 * @author gaopo
 * @date 2018/12/28.
 */
public class Singleton_hungry {

    private static final SingleInstance singleInstance = new SingleInstance();

    public static SingleInstance getSingleInstance() {
        return singleInstance;
    }
}
