import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        int port = 319; // Port number for communication

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            // Wait for a client to connect
            Socket socket = serverSocket.accept();
            System.out.println("New client connected");

            // Create input and output streams
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Read message from client
            String message = reader.readLine();
            System.out.println("Received: " + message);

            // Send a response to the client
            writer.println("Hello, Client! Message received.");

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
