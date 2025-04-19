import java.util.ArrayList;

public class MyLinearSearchExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Linear search
        String target = "Cherry";
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(target)) {
                System.out.println("Found " + target + " at index " + i);
                break;
            }
        }
    }
}
