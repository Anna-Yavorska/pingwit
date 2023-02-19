package org.example.hw_6.hw_8.task_1;

public class MeetingSiteService {
    private final int currentYear = 2023;
    private final int openAccess = 18;
    public void provideService(Person person) {
       if (currentYear - person.getBirthYear() > openAccess && person.getStatus().equals(FamilyStatus.SINGE)){
           if (person.getGender().equals(Gender.MALE)){
               System.out.println("Уважаемый " + person.getName() + ", желаете ли познакомится с девушкой?");
           }else {
               System.out.println("Уважаемая " + person.getName() + ", мы поможем вам найти мужчину мечты!");
           }
        }
    }
   public void arrayProvideService(Person[] person){
       for (int i = 0; i < person.length; i++) {
           provideService(person[i]);
       }
   }
}
