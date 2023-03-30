package org.example.hw_18.task_4;

import java.util.ArrayList;
import java.util.List;

// проверил, замечаний нет
public class Repetition {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Vlad", "Olga", "Timur", "Liudmila", "Konstantin", "Elena"));
        List<String> employees = new ArrayList<>(List.of("Vlad", "Timur", "Konstantin", "Nick", "Tom"));
        names.retainAll(employees);
        System.out.println(names);
    }
}
