import java.util.TreeSet;

public class MyTreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> sortedNumbers = new TreeSet<>();

        // Adding elements
        sortedNumbers.add(24);
        sortedNumbers.add(8);
        sortedNumbers.add(19);

        // Accessing the first and last elements
        System.out.println("Lowest: " + sortedNumbers.first());
        System.out.println("Highest: " + sortedNumbers.last());

        // Iterating through the set
        for (Integer number : sortedNumbers) {
            System.out.println(number);
        }
    }
}
