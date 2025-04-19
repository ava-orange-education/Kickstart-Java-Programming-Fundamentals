import java.io.*;

public class ExceptionExample2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("thisFileDoesNotExist.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}