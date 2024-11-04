package MultiThreadingImplementation;

public class Task {
    private String taskName;
    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void execute() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " is running iteration " + i);
            try {
                Thread.sleep(500);  // Replace this with your own delay mechanism
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
