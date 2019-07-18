package com.samlai.threadpattern.ASingleThread;

public class UserThread extends Thread {


    /**
     * 字段声明 final 非常重要 不可重新赋值
     *
     */
    private final Gate gate;

    private final String name;

    private final String address;

    public UserThread(Gate gate, String name, String address) {
        this.gate = gate;
        this.name = name;
        this.address = address;
    }

    public void run() {
        System.out.println(" name  :  " + name);
        while (true) {
            gate.pass(name, address);
        }
    }




}
