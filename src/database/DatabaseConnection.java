package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    public Connection getConnection() {
        String url = "jdbc:h2:file:C:/data/budget";
        Properties props = new Properties();
        props.setProperty("user", "");
        props.setProperty("password", "");

        try {
            Connection connection = DriverManager.getConnection(url, props);
            System.out.println("Connected to the database: " + connection.isValid(0));
            return connection;
        } catch (SQLException e) {
            System.err.println("Błąd połączenia z bazą danych: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
