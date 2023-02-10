package org.example.hw_6.task_2;

public class Human {
    private static String text = "Hello from static";
    String name;
    int age;

    {
        System.out.println("Создали новый экземпляр класса!");
    }

    public Human() {
        this.name = "Adam";
        this.age = 30;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        Human.text = text;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
