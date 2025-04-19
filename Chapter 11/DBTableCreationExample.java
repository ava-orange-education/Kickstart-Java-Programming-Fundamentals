import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTableCreationExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:sampledb.db";

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            // Creating a students table
            String createTableSQL = """
                    CREATE TABLE IF NOT EXISTS students (
                        id INTEGER PRIMARY KEY,
                        name TEXT NOT NULL,
                        age INTEGER
                    );
                    """;
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'students' created successfully.");

            // Inserting sample data
            String insertDataSQL = """
                    INSERT INTO students (name, age)
                    VALUES ('Neo', 22), ('Trinity', 24);
                    """;
            int rowsInserted = statement.executeUpdate(insertDataSQL);
            System.out.println(rowsInserted + " rows inserted into 'students' table.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
