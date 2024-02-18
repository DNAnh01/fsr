package com.dnanh01.connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DbProvider {

    private DbProvider() {
    }

    public static Properties getProperties() {
        Properties properties = new Properties();
        File file = new File(DbConstants.APPLICATION_PROPERTIES);
        try {
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
