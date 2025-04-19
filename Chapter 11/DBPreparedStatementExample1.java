import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBPreparedStatementExample1 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:sampledb.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            String insertSQL = "INSERT INTO students (name, age) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                // Setting parameters
                preparedStatement.setString(1, "Morpheus");
                preparedStatement.setInt(2, 41);

                // Executing the statement
                int rowsInserted = preparedStatement.executeUpdate();
                System.out.println(rowsInserted + " row(s) inserted.");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
