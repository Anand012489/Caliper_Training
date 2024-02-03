package Exception_Handling;

public class MAth{
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } 
        
        catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } 
        
        catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
        
    }

}