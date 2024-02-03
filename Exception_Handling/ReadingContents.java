package Exception_Handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingContents {
    public static void main(String[] args) {
        try {
            File file = new File("Document-1.pdf");
            
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } 
        
        catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        
        catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
    
}
