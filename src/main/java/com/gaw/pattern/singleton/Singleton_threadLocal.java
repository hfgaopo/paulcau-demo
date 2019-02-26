package com.gaw.pattern.singleton;

/**
 * desc threadlocal单例
 *
 * @author gaopo
 * @date 2018/12/28.
 */
public class Singleton_threadLocal {
    private static final ThreadLocal preThreadLocal = new ThreadLocal();
    private static SingleInstance singleInstance;

    private Singleton_threadLocal() {
    }

    public static SingleInstance getSingleInstance() {
        if (preThreadLocal.get() == null) {
            createInstance();
        }
        return singleInstance;
    }

    private static final void createInstance() {
        synchronized (Singleton_threadLocal.class) {
            if (singleInstance == null) {
                singleInstance = new SingleInstance();
            }
        }
        preThreadLocal.set(preThreadLocal);
    }

}
