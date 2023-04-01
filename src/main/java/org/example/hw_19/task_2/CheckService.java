package org.example.hw_19.task_2;

import java.math.BigDecimal;
import java.util.*;

public class CheckService {
    public void printCheck(List<Product> products) {
        Integer unit = 1;
        BigDecimal totalPrice = BigDecimal.ZERO;
        Map<Product, Integer> productsList = new HashMap<>();
        for (Product product : products) {
            if (productsList.containsKey(product)) {
                Integer quantity = productsList.get(product);
                quantity = quantity + unit;
                productsList.put(product, quantity);
            } else {
                productsList.put(product, unit);
            }
        }

        for (Map.Entry<Product, Integer> entry : productsList.entrySet()) {
            BigDecimal price = entry.getKey().getPrice();
            BigDecimal quantity = BigDecimal.valueOf(entry.getValue());
            totalPrice = totalPrice.add(price.multiply(quantity));
        }
        System.out.println(productsList);
        System.out.println("You have to pay: " + totalPrice);
    }
}
