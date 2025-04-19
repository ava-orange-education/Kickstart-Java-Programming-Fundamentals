package SLAP_LMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:sqlite:slap_lms.db";

    public static Connection connect() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL);
            System.out.println("Connected to the database successfully!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
            return null;
        }
    }
}