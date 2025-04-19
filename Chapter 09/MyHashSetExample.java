import java.util.HashSet;

public class MyHashSetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueWords = new HashSet<>();

        // Adding elements
        uniqueWords.add("Java");
        uniqueWords.add("Python");
        uniqueWords.add("C++");
        uniqueWords.add("Swift");
        uniqueWords.add("Java"); // Duplicate, will be ignored

        // Checking for membership
        System.out.println("Contains Java: " + uniqueWords.contains("Java"));

        // Iterating through the set
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
