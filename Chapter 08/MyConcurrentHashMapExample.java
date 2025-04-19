import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("Key1", 1);
        map.put("Key2", 2);

        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
