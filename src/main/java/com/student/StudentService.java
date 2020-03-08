package com.student;

public class StudentService {
    private Student[] students;

    public StudentService() {
        students = new Student[5];
    }// 3 not null + 2 nulls

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public boolean compareLastNames(Student s1, Student s2) {
        String l1 = s1.getLastName();
        String l2 = s2.getLastName();

        boolean result = l1.equals(l2);
        return result;
    }

    public boolean compareGroup(Student s1, Student s3) {
        String g1 = s1.getGroup().getName();
        String g3 = s3.getGroup().getName();

        boolean result = g1.equals(g3);
        return result;
    }


}
