package org.example.hw_8.task_1;

public class MeetingSiteService {
    // плиз переименуй переменную из people в person
    public void provideService(Person people) {
        // Обе этих переменных вынеси в константы, плиз
        int currentYear = 2023;
        int openAccess = 18;
        if (currentYear - people.getBirthYear() > openAccess
                && people.getStatus().equals(FamilyStatus.SINGE)
                && people.getGender().equals(Gender.MALE)) {
            System.out.println("Уважаемый " + people.getName() + ", желаете ли познакомится с девушкой?");
        }
        if (currentYear - people.getBirthYear() > openAccess
                && people.getStatus().equals(FamilyStatus.SINGE)
                && people.getGender().equals(Gender.FEMALE)) {
            System.out.println("Уважаемая " + people.getName() + ", мы поможем вам найти мужчину мечты!");
        }
    }

    // в целом, в методе для нескольких человек ты можешь использовать метод для одного человека, например так:
    /*
    public void arrayProvideService(Person[] people) {
        for (Person person : people) {
            provideService(person);
        }
    }
     */


    public void arrayProvideService(Person[] people) {
        int currentYear = 2023;
        int openAccess = 18;
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            if (currentYear - person.getBirthYear() > openAccess
                    && person.getStatus().equals(FamilyStatus.SINGE)
                    && person.getGender().equals(Gender.MALE)) {
                System.out.println("Уважаемый " + person.getName() + ", желаете ли познакомится с девушкой?");
            }
            if (currentYear - person.getBirthYear() > openAccess
                    && person.getStatus().equals(FamilyStatus.SINGE)
                    && person.getGender().equals(Gender.FEMALE)) {
                System.out.println("Уважаемая " + person.getName() + ", мы поможем вам найти мужчину мечты!");
            }
        }
    }

    // метод можно немного упростить, можешь свой код не менять, просто для информации:
    public void arrayProvideServiceSimplified(Person[] people) {
        int currentYear = 2023;
        int openAccess = 18;
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            if (currentYear - person.getBirthYear() > openAccess && person.getStatus().equals(FamilyStatus.SINGE)) {
                if (person.getGender().equals(Gender.MALE)) {
                    System.out.println("Уважаемый " + person.getName() + ", желаете ли познакомится с девушкой?");
                } else if (person.getGender().equals(Gender.FEMALE)) {
                    System.out.println("Уважаемая " + person.getName() + ", мы поможем вам найти мужчину мечты!");
                }
            }
        }
    }
}
