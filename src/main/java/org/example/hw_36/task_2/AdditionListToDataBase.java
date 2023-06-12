package org.example.hw_36.task_2;

import org.example.hw_36.task_1.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdditionListToDataBase {
    private static final String URL = "jdbc:postgresql://localhost:5432/hw_35";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product(181, "Paprika", "500 gram 3 types", 5.05),
                new Product(191, "Ice cream", "1 kilo pack", 4.38),
                new Product(201, "Wet wipes", "72 pack", 2.15)
        ));
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products (id, name, description, price) VALUES (?, ?, ?, ?)");

            for (Product product : products) {
                preparedStatement.setInt(1, product.id());
                preparedStatement.setString(2, product.name());
                preparedStatement.setString(3, product.description());
                preparedStatement.setDouble(4, product.price());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
