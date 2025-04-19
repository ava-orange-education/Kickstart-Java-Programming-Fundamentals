package main;

import java.sql.*;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:sqlite:resources/tasks.db";

    public static void initializeDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS tasks (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                         "title TEXT NOT NULL," +
                         "description TEXT," +
                         "dueDate TEXT," +
                         "status TEXT," +
                         "priority TEXT)";
            stmt.executeUpdate(sql);
            System.out.println("[✓] Database initialized.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add methods for insertTask(), getTasks(), updateTask(), deleteTask()...
}
