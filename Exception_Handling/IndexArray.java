package Exception_Handling;

public class IndexArray {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An array index out of bounds exception occurred: " + e.getMessage());
        } 
        
        catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
    
}
