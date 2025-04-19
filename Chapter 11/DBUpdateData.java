import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUpdateData {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:sampledb.db";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            // Updating a record in the students table
            String updateSQL = "UPDATE students SET age = 32 WHERE name = 'Trinity'";
            int rowsUpdated = statement.executeUpdate(updateSQL);
            System.out.println(rowsUpdated + " rows updated.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
