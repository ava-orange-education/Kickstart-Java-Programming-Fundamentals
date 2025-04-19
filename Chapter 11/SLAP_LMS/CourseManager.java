package SLAP_LMS;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CourseManager {
    public static void addCourse(String name, String instructor) {
        String insertSQL = "INSERT INTO Courses (name, instructor) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, instructor);
            preparedStatement.executeUpdate();
            System.out.println("Course added successfully!");
        } catch (Exception e) {
            System.out.println("Error adding course: " + e.getMessage());
        }
    }
}
