package org.example.hw_6.task_3;

import org.example.hw_6.task_2.Human;

import java.util.Arrays;

public class ArrayOfHuman {
    public static void main(String[] args) {
        Human david = new Human("David", 25);
        Human gleb = new Human("Gleb", 13);
        Human human = new Human();
        Human elena = new Human("Elena", 18);
        Human[] humans = new Human[]{david, gleb, human, elena};

        System.out.println(Arrays.toString(humans));
    }
}
