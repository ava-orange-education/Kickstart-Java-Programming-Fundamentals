package SLAPLMS;

import java.io.*;
import java.net.*;

public class SLAPLMS_Server {
    public static void main(String[] args) {
        int port = 8080;  // Server port

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("SLAP LMS Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accept client connection
                System.out.println("New client connected");

                new Thread(() -> {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                         PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
                        
                        String message;
                        while ((message = reader.readLine()) != null) {
                            System.out.println("Client says: " + message);
                            writer.println("Server received: " + message);
                        }
                    } catch (IOException e) {
                        System.out.println("Error handling client: " + e.getMessage());
                    }
                }).start();
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
