package com.gaw.pattern.proxy.dynamic;

/**
 * desc todo
 *
 * @author gaopo
 * @date 2018/10/10.
 */
public class MonitorUtil {
    private static ThreadLocal<Long> t1 = new ThreadLocal<>();

    public static void start() {
        t1.set(System.currentTimeMillis());
    }

    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法执行耗时" + (finishTime - t1.get()) + "ms");
    }
}
