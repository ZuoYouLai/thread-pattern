package com.samlai.threadpattern.ASingleThread;

public class Gate {
    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public synchronized void  pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    @Override
    public String toString() {
        return "No." + counter + "  :   name :   " + name + "   address  :   " + address;
    }

    private synchronized void check() {
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("RESULT  :  " + toString());
        }
    }

}
