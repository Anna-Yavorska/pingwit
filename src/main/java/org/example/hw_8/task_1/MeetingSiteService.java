package org.example.hw_8.task_1;

public class MeetingSiteService {
    public void provideService(Person people) {
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
}
