package com.person;

public class TestPosition {
    public static void main(String[] args) {
        Position manager = new Position("Manager");

        Person person1 = new Person("Sidorov", 25, manager);
        person1.view();
    }
}
