package com.student;

public class TestStudent {
    public static void main(String[] args) {
        Group group1 = new Group("Java", 15);
        Group group2 = new Group("SQL", 10);

        University university1 = new University("Garvard", 25, 1950);
        University university2 = new University("DGU", 50, 1970);



        Student student1 = new Student("Petr", Gender.MALE, "Petrov",
                25, group1, university1);
        Student student2 = new Student("Ivanna", Gender.FEMALE, "Petrova",
                24, group1, university1);
        Student student3 = new Student("Sidor", Gender.MALE, "Sidorov",
                24, group2, university2);

        StudentService studentService = new StudentService();

        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);

        boolean b = studentService.compareLastNames(student1, student2);

        System.out.println(b);

        boolean v = studentService.compareGroup(student3, student2);

        System.out.println(v);

    }

}
