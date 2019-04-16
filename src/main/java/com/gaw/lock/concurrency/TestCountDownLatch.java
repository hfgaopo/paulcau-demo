package com.gaw.lock.concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * @author gaopo
 * @date 2019/4/9.
 */
public class TestCountDownLatch {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(10000);
    }
}
