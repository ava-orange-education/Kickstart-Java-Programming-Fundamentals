public class ExplicitThrowExample {
    public static void main(String[] args) {
        int age = 8;
        if (age < 18) {
            throw new IllegalArgumentException("You must be at least 18 to vote.");
        }
    }
}
