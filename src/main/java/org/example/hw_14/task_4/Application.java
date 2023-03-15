package org.example.hw_14.task_4;

public class Application {
    public static void main(String[] args) {
        String string = "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";

        PersonParser personParser = new PersonParser();
        Person[] people = personParser.parseToPerson(string);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
