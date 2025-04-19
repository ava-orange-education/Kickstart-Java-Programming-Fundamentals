import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class AsymmetricEncryptionExample {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048); // Key size
        KeyPair keyPair = keyGen.generateKeyPair();

        System.out.println("Public Key: " + keyPair.getPublic());
        System.out.println("Private Key: " + keyPair.getPrivate());
    }
}
