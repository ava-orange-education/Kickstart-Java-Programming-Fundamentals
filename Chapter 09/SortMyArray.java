import java.util.Arrays;

public class SortMyArray {
    public static void main(String[] args) {
        int[] numbers = {32, 5, 8, 24, 33};

        // Sorting in natural order
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Sorting in reverse order
        Integer[] numbersWrapper = {32, 5, 8, 24, 33}; // Wrapper for Comparator
        Arrays.sort(numbersWrapper, (a, b) -> b - a);
        System.out.println("Sorted in reverse order: " + Arrays.toString(numbersWrapper));
    }
}
