import java.io.*;
import java.util.Scanner;

public class ReadOneLine {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Example2.txt");
        Scanner scanner = new Scanner(fr);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
        fr.close();
    }
}
