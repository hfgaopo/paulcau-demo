package com.gaw.lock.concurrency.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * @author gaopo
 * @date 2019/4/11.
 */
public class ParticleTask extends RecursiveTask<Integer> {

    @Override
    protected Integer compute() {
        ParticleTask particleTask=new ParticleTask();
        particleTask.fork();
        particleTask.join();
        return null;
    }
}
