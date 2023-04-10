package org.example.hw_21.task_2;

import java.util.Map;
import java.util.Scanner;

public class Catalog {
    private static final int EXIT_CONDITION = 0;

    public static void main(String[] args) {
        Product product = new Product();
        Map<Integer, Product> products = product.getProducts();
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
