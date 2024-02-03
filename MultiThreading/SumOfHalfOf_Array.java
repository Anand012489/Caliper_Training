package MultiThreading;

import java.util.Arrays;

public class SumOfHalfOf_Array implements Runnable {
    private int[]numbers;
    private int sum;

    public SumOfHalfOf_Array(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        for (int number : numbers) {
            sum += number;
        }
    }

    public int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length / 2);
        int[] secondHalf = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);

        SumOfHalfOf_Array calculator1 = new SumOfHalfOf_Array(firstHalf);
        SumOfHalfOf_Array calculator2 = new SumOfHalfOf_Array(secondHalf);

        Thread thread1 = new Thread(calculator1);
        Thread thread2 = new Thread(calculator2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = calculator1.getSum() + calculator2.getSum();
        System.out.println("The sum of the numbers is: " + totalSum);
    }
    
}
