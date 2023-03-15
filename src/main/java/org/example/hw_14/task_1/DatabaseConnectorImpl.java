package org.example.hw_14.task_1;

import org.apache.commons.lang3.RandomUtils;

public class DatabaseConnectorImpl implements DatabaseConnector {

    @Override
    public void connectToDatabase(String dataBaseName) throws ConnectingException {
        if (RandomUtils.nextBoolean()) {
            System.out.println("Вы подключились к " + dataBaseName);
        } else {
            throw new ConnectingException("Ошибка подключения к " + dataBaseName);
        }
    }
}
