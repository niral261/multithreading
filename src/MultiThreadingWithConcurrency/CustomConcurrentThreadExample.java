package MultiThreadingWithConcurrency;

public class CustomConcurrentThreadExample {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        SharedResources sharedResource = new SharedResources();

        Task task1 = new Task("Task 1", sharedResource);
        Task task2 = new Task("Task 2", sharedResource);
        Task task3 = new Task("Task 3", sharedResource);

        scheduler.addTask(task1);
        scheduler.addTask(task2);
        scheduler.addTask(task3);

        // Start the scheduler
        scheduler.run();
    }
}
