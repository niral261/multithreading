public class MultiThreading {
    public static void main(String args[]) {
        Thread th = new MyThread();
        th.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is running");
    }
}

