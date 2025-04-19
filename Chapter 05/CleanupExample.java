import java.io.*;

public class CleanupExample {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("NoWhereToBeFound.txt");
            // Perform file operations
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}
