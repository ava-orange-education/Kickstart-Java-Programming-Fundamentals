public class Triangle2 {
    public static void main(String[] args) {
        int rows = 5;

        // This is the outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print("  ");  // Two spaces for each column
            }

            // Print asterisks with spaces in between
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
