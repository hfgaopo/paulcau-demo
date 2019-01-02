package com.cau.demo.designpattern.singleton;

import java.util.HashSet;
import java.util.Set;

/**
 * desc 单例测试类
 *
 * @author gaopo
 * @date 2018/12/28.
 */
public class Test {

    public static void main(String[] args) {
        Set<Object> sets = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            new Thread(() -> sets.add(Singleton_idler.getSingleInstance1())).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sets.forEach(set -> System.out.println(set));
    }
}
