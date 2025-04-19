import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) {
        String fileName = "myDataStreamExample.dat";

        // Writing data using DataOutputStream
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOut.writeInt(319);
            dataOut.writeFloat(3.19f);
            dataOut.writeUTF("Data stream test.");
        } catch (IOException e) {
            System.out.println("Error writing data stream: " + e.getMessage());
        }

        // Reading data using DataInputStream
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream(fileName))) {
            int number = dataIn.readInt();
            float pi = dataIn.readFloat();
            String message = dataIn.readUTF();

            System.out.println("Values read: " + number + ", " + pi + ", " + message);
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
