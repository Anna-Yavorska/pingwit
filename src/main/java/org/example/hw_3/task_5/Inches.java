package org.example.hw_3.task_5;

// Отлично!
public class Inches {
    public static void main(String[] args) {
        double coefficient = 2.54;
        int centimeter = 20;

        System.out.println("Inches to centimeters");
        for (int i = 0; i <= centimeter; i++) {
            System.out.println(i + " = " + i * coefficient);
        }
    }
}
