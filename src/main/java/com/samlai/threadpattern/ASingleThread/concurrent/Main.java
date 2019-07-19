package com.samlai.threadpattern.ASingleThread.concurrent;

public class Main {
    public static void main(String[] args) {
        //设置资源
        BoundeResource resource = new BoundeResource(3);
        for (int i = 0; i < 10; i++) {
            new UserThread(resource).start();
        }
    }
}
