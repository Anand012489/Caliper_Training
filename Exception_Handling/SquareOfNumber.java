package Exception_Handling;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            int num = scanner.nextInt();

            if (num < 0) {
                throw new Exception("Number cannot be negative");
            }

            System.out.println("The square of " + num + " is " + num * num);
        } 
        
        catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } 
    }

    
}
