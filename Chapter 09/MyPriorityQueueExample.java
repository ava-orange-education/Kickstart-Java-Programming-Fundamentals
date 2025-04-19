import java.util.PriorityQueue;

public class MyPriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.offer(24);
        pq.offer(32);
        pq.offer(8);

        // Accessing the head
        System.out.println("Head of the queue: " + pq.peek());

        // Removing elements
        while (!pq.isEmpty()) {
            System.out.println("Processing: " + pq.poll());
        }
    }
}
