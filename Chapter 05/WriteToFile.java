import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("WriteExample1.txt");
        writer.write("Hello, Java!\n");
        writer.write("Java is the name of my Corgi puppy.");
        writer.close();
    }
}