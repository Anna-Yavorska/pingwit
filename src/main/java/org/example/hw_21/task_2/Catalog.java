package org.example.hw_21.task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {
    private static final int EXIT_CONDITION = 0;

    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();
        products.put(15, new Product(15, "Milk", "Pasteurized, fat 3,5%"));
        products.put(1, new Product(1, "Bread", "From premium flour, chopped"));
        products.put(5, new Product(5, "Notebook", "Checkered notebook 48 sheets"));
        products.put(78, new Product(78, "Notebook", "Checkered notebook 48 sheets"));
        products.put(8, new Product(8, "Potato", "Washed potatoes in a net, 2,5kg"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our catalog");
        System.out.println("If you want to exit - enter '0'");

        while (true) {
            System.out.println("Enter the id of the product you are interested in:");
            int id = scanner.nextInt();

            if (id == EXIT_CONDITION) {
                System.out.println("We will be glad to see You again!");
                return;
            }
            if (products.containsKey(id)) {
                System.out.println(products.get(id));
            } else {
                System.out.printf("There is no product with id:%d in our store", id);
                System.out.println();
            }
        }
    }
}
