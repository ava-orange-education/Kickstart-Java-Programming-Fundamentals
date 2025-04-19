import java.util.TreeMap;

public class MyTreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> countryMap = new TreeMap<>();

        // Adding key-value pairs
        countryMap.put("US", "United States");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("IN", "India");
        countryMap.put("IT", "Italy");

        // Iterating through the map
        for (String code : countryMap.keySet()) {
            System.out.println(code + " -> " + countryMap.get(code));
        }

        // Accessing a subset of keys
        System.out.println("Countries before 'UK': " + countryMap.headMap("UK"));
    }
}
