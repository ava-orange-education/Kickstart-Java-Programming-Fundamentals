import java.io.*;

public class ReadOneChar {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Example1.txt");
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }
}