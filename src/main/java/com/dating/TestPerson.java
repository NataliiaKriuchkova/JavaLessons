package com.dating;

import com.student.Gender;

public class TestPerson {
    public static void main(String[] args) throws NullPointerException {
        Person person1 = new Person("Ivan", "Ivanov", 25,
                "Dnepr", 0, Gender.MALE);
        Person person2 = new Person("Petr", "Petrov", 45,
                "Lviv", 2, Gender.MALE);
        Person person3 = new Person("Svetlana", "Svetlova", 25,
                "Dnepr", 0, Gender.FEMALE);
        Person person4 = new Person("Elena", "Egorova", 45,
                "Lviv", 1, Gender.FEMALE);

        PersonServise personServise = new PersonServise();

        personServise.addPerson(person1);
        personServise.addPerson(person2);
        personServise.addPerson(person3);
        personServise.addPerson(person4);

    }
}
