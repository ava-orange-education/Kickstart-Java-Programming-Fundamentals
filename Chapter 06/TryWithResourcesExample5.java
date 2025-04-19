import java.io.*;

public class TryWithResourcesExample5 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("thisFileDoesNotExist.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Primary exception: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed exception: " + suppressed.getMessage());
            }
        }
    }
}
