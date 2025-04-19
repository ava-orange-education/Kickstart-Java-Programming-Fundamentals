import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("mySource.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("myDestination.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
