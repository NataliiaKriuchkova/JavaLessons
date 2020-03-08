package com;

public class Calculator {

    private int age;
    private String name;
    private Calculator calculator;

    public Calculator(int age, String name) {//name = "John"

//        var r = 10;

        if (age < 0) {
            System.out.println("");
            age = 1;
        } else {
            this.age = age;
        }
        this.name = name;
    }

    public Calculator() {
    }
// access_modificator void(or return type) name_of_method(incoming params or absent);
    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}