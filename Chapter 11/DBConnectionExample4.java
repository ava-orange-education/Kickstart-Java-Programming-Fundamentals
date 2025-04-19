import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionExample4 {
    public static void main(String[] args) {
        if (isDatabaseConnected()) {
            System.out.println("Database connection is valid!");
        } else {
            System.out.println("Database connection failed.");
        }
    }

    public static boolean isDatabaseConnected() {
        String url = "jdbc:sqlite:sampledb.db";
        try {
            Class.forName("org.sqlite.JDBC");
            try (Connection connection = DriverManager.getConnection(url)) {
                return connection.isValid(2);  // Check if the connection is valid within 2 seconds.
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
