package com.samlai.threadpattern.ASingleThread.concurrent;

import java.util.Random;

public class UserThread extends Thread {
    private final static Random random = new Random(26535);
    private final BoundeResource resource;

    public UserThread(BoundeResource boundeResource) {
        this.resource = boundeResource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                resource.use();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {

        }
    }

}
