package org.example.hw_36.task_1;

import java.sql.*;

public class Application {
    private static final String URL = "jdbc:postgresql://localhost:5432/hw_35";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";
    private static final int STEP = 2;
    private static final int QUANTITY_PRODUCT = 17;

    public static void main(String[] args) {
        int coefficient = 0;
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            while (coefficient <= QUANTITY_PRODUCT) {
                String select = String.format("SELECT * FROM products LIMIT 2 OFFSET %d", coefficient);
                PreparedStatement preparedStatement = connection.prepareStatement(select);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4));
                    System.out.println(product);
                }
                coefficient += STEP;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
