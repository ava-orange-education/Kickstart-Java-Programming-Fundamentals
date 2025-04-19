import java.util.Deque;
import java.util.LinkedList;

public class MyLinkedListDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Adding elements at both ends
        deque.addFirst("Front");
        deque.addLast("Back");

        // Accessing elements at both ends
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Removing elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from back: " + deque.removeLast());

        // Checking if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
