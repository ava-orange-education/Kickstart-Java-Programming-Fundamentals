import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionExample2 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:sampledb.db";

        try {
            Class.forName("org.sqlite.JDBC");
            try (Connection connection = DriverManager.getConnection(url)) {
                System.out.println("Connected to the SQLite database successfully!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC Driver not found. Make sure the driver is in your classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            if (e.getErrorCode() == 0) {
                System.out.println("Could not establish a connection. Check the database file path.");
            } else {
                System.out.println("Database error: " + e.getMessage());
            }
            e.printStackTrace();
        }
    }
}
