import java.io.*;

public class FileStreamExamples {
    public static void main(String[] args) throws IOException {
        // Writing data to a binary file
        FileOutputStream outputStream = new FileOutputStream("Example2.bin");
        outputStream.write(74); // ASCII value for 'J'
        outputStream.write(65); // ASCII value for 'A'
        outputStream.write(86); // ASCII value for 'V'
        outputStream.write(65); // ASCII value for 'A'
        outputStream.close();

        // Reading data from the binary file
        FileInputStream inputStream = new FileInputStream("Example2.bin");
        int byteData;
        while ((byteData = inputStream.read()) != -1) {
            System.out.print((char) byteData + " ");
        }
        inputStream.close();
    }
}
