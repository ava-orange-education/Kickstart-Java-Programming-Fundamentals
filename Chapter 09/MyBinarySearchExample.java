import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyBinarySearchExample {
    public static void main(String[] args) {
        // Binary search in a list
        List<String> names = Arrays.asList("Neo", "Trinity", "Morpheus");
        Collections.sort(names); // Ensure the list is sorted
        int index = Collections.binarySearch(names, "Trinity");
        System.out.println("Index of 'Trinity': " + index);

        // Binary search in an array
        int[] numbers = {1, 2, 3, 4, 5};
        int result = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + result);
    }
}
