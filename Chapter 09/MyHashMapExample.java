import java.util.HashMap;

public class MyHashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> jerseyMap = new HashMap<>();

        // Adding key-value pairs
        jerseyMap.put("Kobe", 24);
        jerseyMap.put("Magic", 32);
        jerseyMap.put("Worthy", 5);

        // Retrieving a value by key
        System.out.println("Kobe's jersey: " + jerseyMap.get("Kobe"));

        // Iterating through the map
        for (String player : jerseyMap.keySet()) {
            System.out.println(player + " -> " + jerseyMap.get(player));
        }
    }
}
