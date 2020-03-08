package com.dating;

public class PersonServise {
    public Person[] persons;

    public PersonServise() {
        persons = new Person[10];
    }

    public void addPerson(Person person) {

        if (person.getAge() < 18) {
            System.out.println("You're younger");
            return;
        }

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = person;
                break;
            }
        }

        showSuitablePersons(person);
    }

    private void showSuitablePersons(Person p) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null &&
                    persons[i].getAge() == p.getAge() &&
                    persons[i].getGender() != p.getGender()) {
                persons[i].showInfo();
            }
        }
    }



}
