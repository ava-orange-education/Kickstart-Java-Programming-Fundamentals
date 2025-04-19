import java.io.*;

public class WriteToFileBuffered {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("WriteExample2.txt"));
        writer.write("Hello, Java!");
        writer.newLine();
        writer.write("Java is the name of my Corgi puppy.");
        writer.close();
    }
}
