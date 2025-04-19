import java.io.*;

public class ReadOneCharWithErrorHandling {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("Example1.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Failed to close the reader: " + e.getMessage());
                }
            }
        }
    }
}
