package MultiThreading;

public class CurrentThread implements Runnable {
    
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
    public static void main(String[] args) {
        int n = 9;
        
        for (int i = 0; i < n; i++) {
            CurrentThread object = new CurrentThread();
            Thread thread = new Thread(object);
            thread.start();
        }
    }
    
}
