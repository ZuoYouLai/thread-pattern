package com.samlai.threadpattern.BImmutable;

public class PrintPersonThread extends Thread {
    private Person person;

    public PrintPersonThread(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("current Name  :   "+Thread.currentThread().getName() + "    person  :  " + person.toString());
        }
    }
}
