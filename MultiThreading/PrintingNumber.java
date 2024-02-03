package MultiThreading;

class PrintNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class PrintLetters extends Thread {
    public void run() {
        for (char letter = 'a'; letter <= 'j'; letter++) {
            System.out.println(letter);
        }
    }
}

public class PrintingNumber {
    public static void main(String[] args) {
        PrintNumbers t1 = new PrintNumbers();
        PrintLetters t2 = new PrintLetters();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } 
        
        catch (InterruptedException e) {
            System.out.println("Interrupted Exception caught");
        }
        
    }
    
}
