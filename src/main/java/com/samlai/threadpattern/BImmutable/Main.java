package com.samlai.threadpattern.BImmutable;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("samlai", "gz");
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
    }
}
