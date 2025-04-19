import java.io.*;
import java.net.*;

public class MyMultiThreadedServer {
    public static void main(String[] args) {
        int port = 319;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("The Multithreaded Server is listening on port " + port);

            while (true) {
                // Accept new client connections
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                // Create a new thread to handle the client
                new MyClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}