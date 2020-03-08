package com.person;

public class PersonService {
    private Person[] people;

    public PersonService() {
        people = new Person[10];//nulls name = newName;
    }

    /*public PersonService(Person[] newPeople) {
        people = newPeople;
    }*/

    public void addPerson(Person person) {
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = person;
                break;
            }
        }
    }

    public boolean comparePositions(Person p1, Person p2) {
        Position pos1 = p1.getPosition();
        String name1 = pos1.getName();

        Position pos2 = p2.getPosition();
        String name2 = pos2.getName();

        boolean result = name1.equals(name2);

        return result;
    }

    public boolean compareLastName(Person p1, Person p2) {
        String l1 = p1.getLastName();
        String l2 = p2.getLastName();

        boolean result = l1.equals(l2);
        return result;
    }


}
