import java.io.*;
import java.util.Scanner;

public class ReadOneWord {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("Example1.txt"));
        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println(word);
        }
        scanner.close();
    }
}