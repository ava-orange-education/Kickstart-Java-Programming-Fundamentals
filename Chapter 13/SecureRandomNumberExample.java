import java.security.SecureRandom;

public class SecureRandomNumberExample {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int secureRandomNumber = random.nextInt(1000);
        System.out.println("Secure Random Number: " + secureRandomNumber);
    }
}
