import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("myInput.txt");
             FileWriter writer = new FileWriter("myOutput.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
