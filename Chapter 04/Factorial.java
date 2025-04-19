public class Factorial {

    // Recursive method to calculate factorial
    public int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int result = fact.factorial(8);  // Calling the recursive method
        System.out.println("Factorial of 8 is: " + result);  // Output: 40320
    }
}
