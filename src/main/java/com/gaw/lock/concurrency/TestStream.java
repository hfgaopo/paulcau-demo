package com.gaw.lock.concurrency;

import java.util.stream.IntStream;

/**
 * @author gaopo
 * @date 2019/4/11.
 */
public class TestStream {
    public static void main(String[] args) {
        IntStream.range(0, 100).parallel().forEach(TestStream::doTask);
    }


    private static void doTask(int num) {

        System.out.println("任务" + num + "开始:");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("任务" + num + "结束:");
    }
}
