package org.example.hw_13.task_3;

public class Application {
    public static void main(String[] args) {
        Person firstPerson = new Person("Lida", "Mazur");
        Person secondPerson = new Person("Lida", "Mazur");

        PersonServiceByLoop byLoop = new PersonServiceByLoop();
        PersonServiceByReverse byReverse = new PersonServiceByReverse();

        Person personByLoop = byLoop.reversePerson(firstPerson);
        Person personByReverse = byReverse.reversePerson(secondPerson);
        System.out.println(personByLoop);
        System.out.println(personByReverse);

        boolean equals = personByLoop.equals(personByReverse);
        // тернарный оператор очень к месту, молодец
        System.out.println(equals ? "Результат работы обоих методов одинаков" : "Результаты отличаются");
    }
}
