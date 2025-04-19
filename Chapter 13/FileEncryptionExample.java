import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEncryptionExample {
    public static void main(String[] args) throws Exception {
        String data = "Sensitive Configuration Data";

        // Generate AES key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); 
        SecretKey secretKey = keyGen.generateKey();

        // Encrypt data
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedData = cipher.doFinal(data.getBytes());

        // Save encrypted data to a file
        Path path = Path.of("encryptedConfigurationData.dat");
        Files.write(path, encryptedData);
        System.out.println("Configuration data encrypted and saved.");
    }
}
