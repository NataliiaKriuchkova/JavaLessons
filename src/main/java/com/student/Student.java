package com.student;

public class Student {
    private String firstName;
    private Gender gender;
    private String lastName;
    private int age;
    private Group group;
    private University university;

    public Student(String newfirstName, Gender newGender, String newLastName,
                   int newAge, Group newGroup, University newUniversity) {
        firstName = newfirstName;
        gender = newGender;
        lastName = newLastName;
        age = newAge;
        group = newGroup;
        university = newUniversity;
    }

    public String getFirstName() {
        return firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Group getGroup() {
        return group;
    }
    public University getUniversity() {
        return university;
    }

    public void view() {
        String info = group.getInfo();

        System.out.println("First name = " + firstName + "\nSex = " + gender + info);
        System.out.println("Last name = " + lastName);
        System.out.println("Age = " + age);
        System.out.println("University = " + getUniversity()); //???
    }
}
