package com.gaw.demo.concurrence;

/**
 * desc todo
 *
 * @author gaopo
 * @date 2018/11/9.
 */
public class Concurrent {
    public static void main(String[] args) {
        int i=1;
        i=i++;
        System.out.println(i);
    }
}
