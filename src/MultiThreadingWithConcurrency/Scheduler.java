package MultiThreadingWithConcurrency;
import java.util.*;

public class Scheduler {
    private Queue<Task> taskQueue;

    public Scheduler() {
        this.taskQueue = new LinkedList<>();
    }

    public void addTask(Task task) {
        taskQueue.add(task);
    }

    public void run() {
        while(!taskQueue.isEmpty()) {
            Task currtask = taskQueue.poll();
            new Thread(currtask).start();
        }
    }
}
