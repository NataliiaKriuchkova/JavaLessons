package com.person;

public class Person {
    private String lastName;
    private int age;
    private Position position;

    public Person(String newLastName, int newAge, Position newPosition) {
        lastName = newLastName;
        age = newAge;
        position = newPosition;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    public void view() {
        System.out.println("Last name = " + lastName + " Age = " + age + " Position = " + position.getName());
    }
}
