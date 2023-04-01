package org.example.hw_19.task_2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        CheckService checkService = new CheckService();
        Product firstMilk = new Product(123, "Milk", new BigDecimal("12.3"));
        Product secondMilk = new Product(123, "Milk", new BigDecimal("12.3"));
        Product chocolate = new Product(555, "Chocolate", new BigDecimal("7.99"));
        Product oneMoreChocolate = new Product(555, "Chocolate", new BigDecimal("7.99"));
        Product cake = new Product(555, "Cake", new BigDecimal("25.67"));
        Product thirdMilk = new Product(123, "Milk", new BigDecimal("12.3"));

        List<Product> products = new ArrayList<>(List.of(firstMilk, secondMilk, chocolate, oneMoreChocolate, cake, thirdMilk));
        checkService.printCheck(products);
    }
}
