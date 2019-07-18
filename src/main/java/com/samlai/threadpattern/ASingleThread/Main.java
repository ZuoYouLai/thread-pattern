package com.samlai.threadpattern.ASingleThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Gate");
        Gate gate = new Gate();
        new UserThread(gate, "alice", "akb").start();
        new UserThread(gate, "sam", "slice").start();
        new UserThread(gate, "ken", "kpl").start();
    }
}
