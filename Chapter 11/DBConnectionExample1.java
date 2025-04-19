import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionExample1 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:sampledb.db";

        try {
            Class.forName("org.sqlite.JDBC");
            try (Connection connection = DriverManager.getConnection(url)) {
                System.out.println("Connected to the SQLite database successfully!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the SQLite database. Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
