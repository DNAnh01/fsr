package com.dnanh01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            Properties properties = DbProvider.getProperties();
            // connect database
            try {
                Class.forName(properties.getProperty(DbConstants.DRIVER));

                connection = DriverManager.getConnection(
                        properties.getProperty(DbConstants.URL),
                        properties.getProperty(DbConstants.USER),
                        properties.getProperty(DbConstants.PASS));
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
