package org.example.hw_3.task_2;

public class Amoeba {
    public static void main(String[] args) {
        int amoeba = 1;
        int time = 24;
        for (int i = 0; i < time; i += 3) {
            amoeba *= 2;
            System.out.println("After 3 hours quantity of amoebas = " + amoeba);
        }
    }
}
