package com.gaw.demo.pattern.singleton;

/**
 * desc 懒汉式
 *
 * @author gaopo
 * @date 2018/12/27.
 */
public class Singleton_idler {

    private volatile static SingleInstance singleInstance;

    private Singleton_idler() {
    }

    /**
     * first
     *
     * @return
     */
    public static SingleInstance getSingleInstance1() {
        if (null == singleInstance) {
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }

    /**
     * second
     *
     * @return
     */
    public synchronized static SingleInstance getSingleInstance2() {
        if (null == singleInstance) {
            singleInstance = new SingleInstance();
        }
        return singleInstance;
    }

    /**
     * third
     *
     * @return
     */
    public static SingleInstance getSingleInstance3() {
        if (null == singleInstance) {
            synchronized (SingleInstance.class) {
                if (null == singleInstance) {
                    singleInstance = new SingleInstance();
                }
            }
        }
        return singleInstance;
    }

    /**
     * fourth
     *
     * @return
     */
    public static SingleInstance getSingleInstance4() {
        if (null == singleInstance) {
            synchronized (SingleInstance.class) {
                if (null == singleInstance) {
                    singleInstance = new SingleInstance();
                }
            }
        }
        return singleInstance;
    }

    public Object readResolve(){
        return Singleton_innerClass.InnerClass.singleInstance;
    }

}
