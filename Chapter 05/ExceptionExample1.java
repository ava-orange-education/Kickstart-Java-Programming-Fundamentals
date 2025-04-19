public class ExceptionExample1 {
    public static void main(String[] args) {
        int nbrA = 10;
        int nbrB = 0;
        int result = nbrA / nbrB; // This throws an ArithmeticException
        System.out.println("Result: " + result);
    }
}