package com.gaw.multithreading;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.*;

/**
 * @author gaopo
 * @date 2019/4/4.
 */
public class MainTest {
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);
    private static BlockingQueue<Demo> queue = new LinkedBlockingDeque<>();

    public static void main(String[] args) {
        executorService.execute(() -> {
            while (true) {
                try {
                    Demo key = queue.take();
                    Thread.sleep(2000);
                    System.out.println("释放" + key.getValue() + key.getNo());
                    if (9 == key.getNo()) {
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.shutdown();
        for (int i = 0; i < 10; i++) {
            try {
                queue.put(new Demo(i, "队列元素"));
                System.out.println("队列元素" + i + "加入成功");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Data
    @AllArgsConstructor
    static class Demo {
        private int no;
        private String value;
    }
}
