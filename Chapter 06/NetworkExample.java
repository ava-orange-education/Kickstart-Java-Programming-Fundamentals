import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class NetworkExample {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);
             OutputStream output = socket.getOutputStream();
             InputStream input = socket.getInputStream()) {

            output.write("Hello Local Server".getBytes());

            int responseByte;
            while ((responseByte = input.read()) != -1) {
                System.out.print((char) responseByte);
            }
        } catch (IOException e) {
            System.out.println("Network error encountered: " + e.getMessage());
        }
    }
}
