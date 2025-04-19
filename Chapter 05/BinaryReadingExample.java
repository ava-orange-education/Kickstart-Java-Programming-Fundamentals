import java.io.*;

public class BinaryReadingExample {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("Hello.bin");
        int byteData;
        while ((byteData = inputStream.read()) != -1) {
            System.out.print(byteData + " ");
        }
        inputStream.close();
    }
}