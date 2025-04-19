public class StaticExample {
    public static void main(String[] args) {
        int nbr = 25;
        // Calling a static method from the Math class
        double result = Math.sqrt(nbr);  // No need to create an object of Math class
        System.out.println("Square root of " + nbr + " is: " + result);
    }
}

