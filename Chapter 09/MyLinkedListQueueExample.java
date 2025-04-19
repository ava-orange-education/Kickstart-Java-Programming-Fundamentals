import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");
        queue.offer("Task 4");

        // Processing elements
        while (!queue.isEmpty()) {
            System.out.println("Now processing: " + queue.poll());
        }
    }
}
