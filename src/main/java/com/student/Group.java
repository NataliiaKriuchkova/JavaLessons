package com.student;

public class Group {
    private String name;
    private int countStudents;

    public Group(String newNameGroup, int newCountStudentInGroup) {
        name = newNameGroup;
        countStudents = newCountStudentInGroup;
    }

    public String getName() {
        return name;
    }

    public int getCountStudents() {
        return countStudents;
    }

    public String getInfo() {
        return "Group name = " + name + "\tCount students = " + countStudents;
    }
}
