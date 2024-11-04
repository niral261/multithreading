package MultiThreadingWithConcurrency;

public class Task implements Runnable {
    private String taskName;
    private SharedResources sharedResources;

    public Task(String taskName, SharedResources sharedResources) {
        this.taskName = taskName;
        this.sharedResources = sharedResources;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResources.increment(taskName);
            // Simulate task execution delay
            try {
                Thread.sleep(500);  // Simulating time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
