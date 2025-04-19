import java.io.FileInputStream;
import java.security.KeyStore;

public class KeyStoreExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("keystore.jks");
        KeyStore keyStore = KeyStore.getInstance("JKS");
        keyStore.load(fis, "password".toCharArray());

        System.out.println("KeyStore Type: " + keyStore.getType());
        System.out.println("Number of Keys: " + keyStore.size());
    }
}
