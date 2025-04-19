import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class MyThreadPoolServer {
    public static void main(String[] args) {
        int port = 12345;
        int maxThreads = 10;

        ExecutorService pool = Executors.newFixedThreadPool(maxThreads);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Thread-Pooled Server listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");
                pool.execute(new MyClientHandler(clientSocket)); // Submit task to the thread pool
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
    }
}
