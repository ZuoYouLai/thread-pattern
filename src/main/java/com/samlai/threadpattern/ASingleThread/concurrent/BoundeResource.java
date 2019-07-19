package com.samlai.threadpattern.ASingleThread.concurrent;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class BoundeResource {
    private final Semaphore semaphore;
    private final int permits;
    private final static Random random = new Random(314159);

    // 构造函数（permits 为资源个数）
    public BoundeResource(int permits) {
        this.permits = permits;
        semaphore = new Semaphore(permits);
    }

    //使用资源
    public void use() throws InterruptedException{
        semaphore.acquire();
        try {
            doUse();
        }finally {
            semaphore.release();
        }
    }

    //实际使用资源
    public void doUse() throws InterruptedException {
        Log.println("begin  used " + (permits - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("end  used " + (permits - semaphore.availablePermits()));

    }

}
