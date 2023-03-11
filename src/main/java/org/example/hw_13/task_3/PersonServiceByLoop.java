package org.example.hw_13.task_3;

public class PersonServiceByLoop implements PersonReverser {
    @Override
    public Person reversePerson(Person person) {
        Person reversePerson = new Person();
        String name = person.getName();
        String reverseName = turnOver(name);
        reversePerson.setName(reverseName);

        String surname = person.getSurname();
        String reverseSurname = turnOver(surname);
        reversePerson.setSurname(reverseSurname);
        return reversePerson;
    }

    private String turnOver(String string) {
        char[] chars = string.toCharArray();
        char[] reverseString = new char[chars.length];
        int index = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            reverseString[index] = chars[i];
            index++;
        }
        return String.valueOf(reverseString);
    }
}
