package com.dating;

import com.student.Gender;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String sity;
    private int children;
    private Gender gender;

    public Person(String newFirstName, String newLastName, int newAge,
                  String newSity, int newChildren, Gender newGender) {
        firstName = newFirstName;
        lastName = newLastName;
        age = newAge;
        sity = newSity;
        children = newChildren;
        gender = newGender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSity() {
        return sity;
    }

    public int getChildren() {
        return children;
    }

    public Gender getGender() {
        return gender;
    }

    public void showInfo() {
        System.out.println("First name = " + firstName);
    }
}
