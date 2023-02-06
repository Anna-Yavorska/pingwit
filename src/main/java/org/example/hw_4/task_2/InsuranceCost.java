package org.example.hw_4.task_2;

import java.util.Scanner;

public class InsuranceCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 0.25;
        boolean regularCustomer;
        double discount = 0.8;
        boolean trafficAccident;
        double allowance = 1.2;
        double insuranceCost;

        System.out.println("Enter engine size in сm³:");
        int engineCapacity = scanner.nextInt();
        insuranceCost = engineCapacity * rate;

        System.out.println("Have you used our services before? Enter 'true' or 'false':");
        regularCustomer = scanner.nextBoolean();

        if (regularCustomer) {
            insuranceCost = insuranceCost * discount;
        }

        System.out.println("Were there road accidents in the past year? Enter 'true' or 'false':");
        trafficAccident = scanner.nextBoolean();

        if (trafficAccident) {
            insuranceCost = insuranceCost * allowance;
        }
        System.out.println("The cost of your policy is " + insuranceCost + " euros");
    }
}
