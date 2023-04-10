package org.example.hw_21.task_2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Product implements Serializable {
    private Integer id;
    private String name;
    private String description;

    // класс Product описывает одно наименование продукта из магазина, поэтому в нем не должно храниться инфомации о дргуих продуктах и их количесвте
    // логику по заполнению каталога плиз перемести в класс каталог
    private final Map<Integer, Product> products = new HashMap<>();

    public Product() {
    }

    public Product(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<Integer, Product> getProducts() {
        Product product = new Product();
        product.fillMap(products);
        return new HashMap<>(products);
    }

    private void fillMap(Map<Integer, Product> products) {
        products.put(15, new Product(15, "Milk", "Pasteurized, fat 3,5%"));
        products.put(1, new Product(1, "Bread", "From premium flour, chopped"));
        products.put(5, new Product(5, "Notebook", "Checkered notebook 48 sheets"));
        products.put(78, new Product(78, "Notebook", "Checkered notebook 48 sheets"));
        products.put(8, new Product(8, "Potato", "Washed potatoes in a net, 2,5kg"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(products, product.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, products);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
