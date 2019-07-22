package com.samlai.threadpattern.BImmutable;

public final class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "name=  '" + name + ", address=  '" + address;
    }

}
