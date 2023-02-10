package org.example.hw_6.task_4;

import org.example.hw_6.task_2.Human;

public class StaticResult {
    public static void main(String[] args) {
        Human eva = new Human("Eva", 20);
        Human marina = new Human("Marina", 46);
        Human human = new Human();

        marina.setText("Hello from Marina!");

        System.out.println(eva.getText());
        System.out.println(marina.getText());
        System.out.println(human.getText());
    }
}
