import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBPreparedStatementExample2 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:sampledb.db";

        try (Connection connection = DriverManager.getConnection(url)) {
            String selectSQL = "SELECT * FROM students WHERE age > ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {
                // Setting the parameter
                preparedStatement.setInt(1, 22);

                // Executing the query and processing the result set
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("ID: " + resultSet.getInt("id") +
                                       ", Name: " + resultSet.getString("name") +
                                       ", Age: " + resultSet.getInt("age"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
