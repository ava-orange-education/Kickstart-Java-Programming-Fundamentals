import java.io.*;

public class ReadOneWordBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Example1.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                System.out.println(word);
            }
        }
        reader.close();
    }
}

