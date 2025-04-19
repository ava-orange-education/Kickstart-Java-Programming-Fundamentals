import java.io.*;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("NoWhereToBeFound.txt");
            int character = reader.read();
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error occurred: " + e.getMessage());
        }
    }
}