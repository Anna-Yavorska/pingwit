package org.example.hw_6.hw_8.task_1;

public class PersonArray {
    Person personIvan = new Person("Ivan", "Petrov", 1975, Gender.MALE, FamilyStatus.SINGE);
    Person personMarina = new Person("Marina", "Petrova", 2009, Gender.FEMALE, FamilyStatus.SINGE);
    Person personNick = new Person("Nick", "Nelson", 1989, Gender.MALE, FamilyStatus.SINGE);
    Person personVlad = new Person("Vlad", "Smith", 1995, Gender.MALE, FamilyStatus.SINGE);
    Person personSonia = new Person("Sonia", "Volkova", 2000, Gender.FEMALE, FamilyStatus.SINGE);
    Person personPiotr = new Person("Piotr", "Petrov", 1975, Gender.MALE, FamilyStatus.MARRIED);
    Person personOlga = new Person("Olga", "Orlova", 1970, Gender.FEMALE, FamilyStatus.MARRIED);
    Person personDavid = new Person("David", "Nosov", 1984, Gender.MALE, FamilyStatus.MARRIED);

    Person[] people = new Person[]{personIvan, personMarina, personNick, personVlad, personSonia, personPiotr, personOlga, personDavid};

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
}
