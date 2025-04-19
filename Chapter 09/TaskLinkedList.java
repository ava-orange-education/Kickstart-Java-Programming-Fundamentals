import java.util.LinkedList;

public class TaskLinkedList {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        
        // Adding elements
        tasks.add("Create a UI mockup");
        tasks.add("Write the frontend");
        tasks.add("Write the backend");
        tasks.addFirst("Gather requirements");
        
        // Accessing elements
        System.out.println("First task: " + tasks.getFirst());
        
        // Removing elements
        tasks.removeLast();
        
        // Iterating through the list
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
