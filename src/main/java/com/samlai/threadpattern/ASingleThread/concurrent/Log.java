package com.samlai.threadpattern.ASingleThread.concurrent;

public class Log {
    public static void println(String s) {
        System.out.println(Thread.currentThread().getName() + "   :   " + s);
    }
}
