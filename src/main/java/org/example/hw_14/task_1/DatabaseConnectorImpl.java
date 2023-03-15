package org.example.hw_14.task_1;

import org.apache.commons.lang3.RandomUtils;

public class DatabaseConnectorImpl implements DatabaseConnector {

    @Override
    public void connectToDatabase(String dataBaseName) throws Connecting {
        if (RandomUtils.nextBoolean()) {
            throw new Connecting("Ошибка подключения к " + dataBaseName);
        }
    }
}
