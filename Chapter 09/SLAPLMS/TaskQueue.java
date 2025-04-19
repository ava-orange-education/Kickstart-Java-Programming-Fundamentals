package SLAPLMS;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    private Queue<String> taskQueue = new LinkedList<>();

    public void addTask(String task) {
        taskQueue.offer(task);
        System.out.println("Task added: " + task);
    }

    public void processTasks() {
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing task: " + taskQueue.poll());
        }
    }
}

