package org.example.hw_13.task_3;

// по названиям классов: когда класс имплементрует интерфейс, например PersonReverser, принято называть его по схеме:
// xxxPersonReverser - LoopPersonReverser, StringUtilsPersonReverser. Так и остается понятной и его основная функция,
// в данном случае reversePerson, и отличия в имплементациях
public class PersonServiceByLoop implements PersonReverser {
    @Override
    public Person reversePerson(Person person) {
        // если превратишь класс Person в record, то сеттеры пропадут, и нужно будет возвращать новый объект -
        // в данный момент разработчики стараются писать в таком стиле
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
