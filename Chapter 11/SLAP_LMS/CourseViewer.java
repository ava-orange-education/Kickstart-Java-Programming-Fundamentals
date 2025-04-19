package SLAP_LMS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourseViewer {
    public static void displayCourses() {
        String selectSQL = "SELECT * FROM Courses";

        try (Connection connection = DatabaseConnection.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String instructor = resultSet.getString("instructor");
                System.out.println("ID: " + id + ", Course: " + name + ", Instructor: " + instructor);
            }
        } catch (Exception e) {
            System.out.println("Error displaying courses: " + e.getMessage());
        }
    }
}