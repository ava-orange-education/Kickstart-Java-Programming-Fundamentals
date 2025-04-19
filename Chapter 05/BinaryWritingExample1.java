import java.io.*;

public class BinaryWritingExample1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("Example1.bin");
        outputStream.write(72);  //  the ASCII value for 'H'
        outputStream.write(101); //  the ASCII value for 'e'
        outputStream.write(108); //  the ASCII value for 'l'
        outputStream.write(108); //  the ASCII value for 'l'
        outputStream.write(111); //  the ASCII value for 'o'
        outputStream.close();
    }
}
