import java.io.*;

public class RethrowExceptionExample {
    public static void main(String[] args) {
        try {
            processFile();
        } catch (IOException e) {
            System.out.println("Exception handled here (in main()): " + e.getMessage());
        }
    }

    public static void processFile() throws IOException {
        try {
            FileReader reader = new FileReader("NoFileToFind.txt");
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            throw e; // Rethrow the exception to main()
        }
    }
}
