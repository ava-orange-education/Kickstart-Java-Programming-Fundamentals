import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataPersistenceLoad {
    public static void loadCourseData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("courses.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] courseInfo = line.split(",");
                System.out.println("Loaded course: ID " + courseInfo[0] + ", Name: " + courseInfo[1]);
            }
        } catch (IOException e) {
            System.err.println("Error loading course data: " + e.getMessage());
        }
    }
}
