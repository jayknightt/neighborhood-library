package com.pluralsight;

public class Person {
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        return this.name + "who lives at" + this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
