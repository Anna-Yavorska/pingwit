package org.example.hw_8.task_1;

public class PersonMain {
    public static void main(String[] args) {
        MeetingSiteService meetingSite = new MeetingSiteService();

        Person personIvan = new Person("Ivan", "Petrov", 1975, Gender.MALE, FamilyStatus.SINGE);
        Person personMarina = new Person("Marina", "Petrova", 2009, Gender.FEMALE, FamilyStatus.SINGE);
        Person personNick = new Person("Nick", "Nelson", 1989, Gender.MALE, FamilyStatus.SINGE);
        Person personVlad = new Person("Vlad", "Smith", 1995, Gender.MALE, FamilyStatus.SINGE);
        Person personSonia = new Person("Sonia", "Volkova", 2000, Gender.FEMALE, FamilyStatus.SINGE);
        Person personPiotr = new Person("Piotr", "Petrov", 1975, Gender.MALE, FamilyStatus.MARRIED);
        Person personOlga = new Person("Olga", "Orlova", 1970, Gender.FEMALE, FamilyStatus.MARRIED);
        Person personDavid = new Person("David", "Nosov", 1984, Gender.MALE, FamilyStatus.MARRIED);

        meetingSite.provideService(personIvan);
        meetingSite.provideService(personMarina);
        meetingSite.provideService(personNick);
        meetingSite.provideService(personVlad);
        meetingSite.provideService(personSonia);
        meetingSite.provideService(personPiotr);
        meetingSite.provideService(personOlga);
        meetingSite.provideService(personDavid);

        PersonArray personArray = new PersonArray();
        Person[] people = personArray.getPeople();

        System.out.println("Результат работы массива:");

        meetingSite.arrayProvideService(people);

    }
}
