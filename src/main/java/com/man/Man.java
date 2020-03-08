package com.man;

public class Man {
    private String lastName;
    private String firstName;
    private String secondName;
    private int age;
    private String position;

    /*public Man(String lastName, String firstName, String secondName, int age, String position) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.position = position;
    }*/

    public Man(String newLastName, String newFirstName, String newSecondName,
               int newAge, String newPosition) {
        lastName = newLastName;
        firstName = newFirstName;
        secondName = newSecondName;
        age = newAge;
        position = newPosition;
    }

    public void showFirstNameSecondName() {
        System.out.println(firstName + " " + secondName);
    }

    public void showLastNameFirstNameSecondName() {
        System.out.println(lastName + " " + firstName + " " + secondName);
    }

    public void howLastNameFirstNameSecondNameAge() {
        System.out.println(lastName + " " + firstName + " " + secondName + " " + age);
    }

    public void howLastNameFirstNameSecondNamePosition() {
        System.out.println(lastName + " " + firstName + " " + secondName + " " + position);
    }
}
