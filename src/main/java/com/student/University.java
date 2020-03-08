package com.student;

public class University {
    private String nameUniversity;
    private int countGroupInUniversity;
    private int year;

    public University(String newNameUniversity, int newCountGroupInUniversity, int newYear) {
        nameUniversity = newNameUniversity;
        countGroupInUniversity = newCountGroupInUniversity;
        year = newYear;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public int getCountGroupInUniversity() {
        return countGroupInUniversity;
    }

    public int getYear() {
        return year;
    }
}
