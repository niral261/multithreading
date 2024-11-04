public class RunnableThreadExample {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable,"Niral");
        thread.start();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(1);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}