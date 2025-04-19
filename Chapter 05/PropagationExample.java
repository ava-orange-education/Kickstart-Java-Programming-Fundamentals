import java.io.*;

public class PropagationExample {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("The System caught an IOException: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        FileReader reader = new FileReader("ThisFileSimplyDoesNotExist.txt");
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }
}