package org.example.hw_37.task_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionForInserts {
    private static final String URL = "jdbc:postgresql://localhost:5432/hw_35";
    private static final String USERNAME = "pingwit";
    private static final String PASSWORD = "pingwit_password";

    public static void main(String[] args) {
        runTransactionForInserts();
    }

    private static void runTransactionForInserts() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            connection.setAutoCommit(false);

            String insertIntoOrders = "INSERT INTO orders (id, user_id, created_at, status_id, comment) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertIntoOrders);
            preparedStatement.setInt(1, 9);
            preparedStatement.setInt(2, 14);
            preparedStatement.setDate(3, Date.valueOf("2023-06-19"));
            preparedStatement.setInt(4, 12);
            preparedStatement.setString(5, "Waiting for payment");

            preparedStatement.executeUpdate();
            List<OrderItems> orderItems = new ArrayList<>();
            orderItems.add(new OrderItems(52, 9, 41, 1));
            orderItems.add(new OrderItems(53, 9, 61, 2));
            orderItems.add(new OrderItems(54, 9, 111, 10));

            String insertIntoOrderItems = "INSERT INTO order_items(id, order_id, product_id, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertIntoOrderItems);
            for (OrderItems orderItem : orderItems) {
                statement.setInt(1, orderItem.id());
                statement.setInt(2, orderItem.order_id());
                statement.setInt(3, orderItem.product_id());
                statement.setInt(4, orderItem.quantity());

                statement.executeUpdate();
            }
            connection.commit();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
