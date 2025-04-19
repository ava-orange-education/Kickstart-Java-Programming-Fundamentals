import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        String host = "localhost"; // Server address
        int port = 319; // Server port

        try (Socket socket = new Socket(host, port)) {
            // Create input and output streams
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Send a message to the server
            writer.println("Hello, Server!");

            // Read response from server
            String response = reader.readLine();
            System.out.println("Server response: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
