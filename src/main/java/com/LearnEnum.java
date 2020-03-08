package com;

public class LearnEnum {
    public static void main(String[] args) {

        Gender male = Gender.MALE;

//        print(Gender.FEMALE);

        String fromUser = "Male";

        Gender gender = Gender.valueOf(fromUser.toUpperCase());//переводим String в enum

        for (Gender value : Gender.values()) {

        }

        System.out.println(Gender.MALE.getShortName());

    }

    public static void print(Gender gender) {

    }
}

enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private String shortName;

    Gender(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
