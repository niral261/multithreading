package MultiThreadingImplementation;

public class CustomThreadExample {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        Task t1 = new Task("task 1");
        Task t2 = new Task("task 2");

        scheduler.addTask(t1);
        scheduler.addTask(t2);
        scheduler.run();
    }
}
