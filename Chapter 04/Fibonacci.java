public class Fibonacci {

    // Recursive method to calculate Fibonacci number
    public int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibonacci(8);  // Calling the recursive method
        System.out.println("Fibonacci of 8 is: " + result);  // Result = 21
    }
}
