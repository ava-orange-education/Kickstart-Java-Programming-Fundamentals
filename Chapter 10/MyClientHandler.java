import java.io.*;
import java.net.*;

class MyClientHandler extends Thread {
    private Socket socket;

    public MyClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (InputStream input = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input));
             OutputStream output = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(output, true)) {

            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("Received: " + message);
                writer.println("Echo: " + message); // Send response
            }
        } catch (IOException e) {
            System.out.println("Client disconnected");
        }
    }
}