package com.cau.demo.controller;

import com.cau.demo.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by  gaopo on  2017/9/25.
 */
@RestController
@RequestMapping("/")
public class BaseContrller {
    @Autowired
    private Author author;

    @RequestMapping("/")
    public String toIndex() {
        //String var = "adjlgjasdg";
        //var.strip();
        return "hello spring boot demo\n name:" + author.getName() + " age:" + author.getAge() + " color:" + author.getColor();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Integer> list = new ArrayList<>();
        List<Future<Integer>> futureList = new ArrayList<>();


    }

    private void createThread() {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(1024), r -> null, new ThreadPoolExecutor.AbortPolicy());

        threadPoolExecutor.execute(() -> System.out.println("................"));
        threadPoolExecutor.submit(() -> {

        });
        threadPoolExecutor.shutdown();
    }

}
