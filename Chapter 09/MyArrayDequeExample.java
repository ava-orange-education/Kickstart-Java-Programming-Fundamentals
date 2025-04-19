import java.util.ArrayDeque;
import java.util.Deque;

public class MyArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to both ends
        deque.addFirst("Start");
        deque.addLast("End");

        // Accessing elements
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // Removing elements
        System.out.println("Removed: " + deque.removeFirst());
    }
}
