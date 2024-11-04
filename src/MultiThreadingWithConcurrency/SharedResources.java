package MultiThreadingWithConcurrency;

public class SharedResources {
    private int counter=0;
    private boolean isLocked=false;

    public synchronized void lock() throws InterruptedException {
        while(isLocked){
            wait();
        }
        isLocked=true;
    }

    public synchronized void unlock(){
        isLocked=false;
        notify();
    }

    // Access shared resource (critical section)
    public void increment(String taskName) {
        try {
            lock();  // Lock the resource before access
            System.out.println(taskName + " incrementing counter. Before: " + counter);
            counter++;
            System.out.println(taskName + " incremented counter. After: " + counter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            unlock();  // Always unlock in the end
        }
    }
}
