package org.example.hw_14.task_1;

public class Application {
    public static void main(String[] args) {
        DatabaseConnectorImpl databaseConnector = new DatabaseConnectorImpl();
        String dataBaseName = "MySQL";
        try {
            databaseConnector.connectToDatabase(dataBaseName);
            // печать сообщения "Вы подключились к " + dataBaseName я бы рекомендовал перенести в коннектор
            // если там ошибка  - выводится сообщение о ней, если упех - выводится сообщение об успехе
            System.out.println("Вы подключились к " + dataBaseName);
            System.out.println("Какие данные Вас интересуют?");
        } catch (Connecting e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Закрываем ресурсы");
        }
        System.out.println("Желаем удачи!");
    }
}
