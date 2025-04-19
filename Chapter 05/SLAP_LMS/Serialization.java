import java.io.*;

public class Serialization {
    public static void saveCourseObject(Course course) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("courses.ser"))) {
            oos.writeObject(course);
        } catch (IOException e) {
            System.err.println("Error saving course object: " + e.getMessage());
        }
    }

    public static Course loadCourseObject() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("courses.ser"))) {
            return (Course) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading course object: " + e.getMessage());
            return null;
        }
    }
}
