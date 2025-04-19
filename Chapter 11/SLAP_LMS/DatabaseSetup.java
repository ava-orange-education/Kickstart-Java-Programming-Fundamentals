package SLAP_LMS;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseSetup {
    public static void createTables() {
        String createCoursesTable = """
            CREATE TABLE IF NOT EXISTS Courses (
                id INTEGER PRIMARY KEY,
                name TEXT NOT NULL,
                instructor TEXT NOT NULL
            );
        """;

        try (Connection connection = DatabaseConnection.connect();
             Statement statement = connection.createStatement()) {
            statement.execute(createCoursesTable);
            System.out.println("Courses table created successfully.");
        } catch (Exception e) {
            System.out.println("Error creating tables: " + e.getMessage());
        }
    }
}
