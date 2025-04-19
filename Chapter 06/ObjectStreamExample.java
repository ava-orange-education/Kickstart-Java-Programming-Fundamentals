import java.io.*;

public class ObjectStreamExample {
    public static void main(String[] args) {
        String fileName = "objectStreamExample.ser";

        // Serializing the object
        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(fileName))) {
            Cyborg cyborg = new Cyborg("Seven of Nine", 6);
            objOut.writeObject(cyborg);
            System.out.println("Object serialized: " + cyborg);
        } catch (IOException e) {
            System.out.println("Error serializing object: " + e.getMessage());
        }

        // Deserializing the object
        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fileName))) {
            Cyborg cyborg = (Cyborg) objIn.readObject();
            System.out.println("Object deserialized: " + cyborg);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing object: " + e.getMessage());
        }
    }
}