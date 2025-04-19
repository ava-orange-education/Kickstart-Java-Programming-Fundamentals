import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataPersistenceWrite {
    public static void saveCourseData(String courseName, int courseID) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("courses.txt", true))) {
            writer.write(courseID + "," + courseName);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error saving course data: " + e.getMessage());
        }
    }
}
