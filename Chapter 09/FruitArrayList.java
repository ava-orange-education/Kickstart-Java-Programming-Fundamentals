import java.util.ArrayList;

public class FruitArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        
        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); 
        
        // Modifying elements
        fruits.set(1, "Blueberry");
        
        // Removing elements
        fruits.remove("Cherry");
        
        // Iterating through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
