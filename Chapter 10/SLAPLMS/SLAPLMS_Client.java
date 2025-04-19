package SLAPLMS;

import java.io.*;
import java.net.*;

public class SLAPLMS_Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8080;

        try (Socket socket = new Socket(host, port);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
            writer.println("Student enrollment request: Alice, ID 1001");
            System.out.println("Server response: " + reader.readLine());
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}

