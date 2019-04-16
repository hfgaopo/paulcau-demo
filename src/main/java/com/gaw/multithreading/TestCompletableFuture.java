package com.gaw.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author gaopo
 * @date 2019/4/8.
 */
public class TestCompletableFuture {

    ReentrantLock lock=new ReentrantLock();
    Condition emptyCondition=lock.newCondition();

    public void pushToStack(){
        emptyCondition.signalAll();
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }

}
