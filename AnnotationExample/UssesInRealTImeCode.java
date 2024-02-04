package AnnotationExample;

// A custom annotation to log the execution time of a method
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // This annotation can be applied to methods
@Retention(RetentionPolicy.RUNTIME) // This annotation should be retained at runtime
@interface LogExecutionTime {
    // An optional value to specify the logging level
    String value() default "INFO";
}

// A class that uses the custom annotation
import java.util.logging.Logger;

public class UssesInRealTImeCode {

    // A logger object to log the messages
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    // A method that is annotated with @LogExecutionTime
    @LogExecutionTime("DEBUG")
    public int add(int a, int b) {
        // Get the start time of the method execution
        long startTime = System.currentTimeMillis();

        // Perform some computation
        int result = a + b;
        try {
            Thread.sleep(1000); // Simulate a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Geting the end time of the method execution
        long endTime = System.currentTimeMillis();

        // Calculating the execution time
        long duration = endTime - startTime;

        // Log the execution time using the specified level
        LOGGER.log(Level.parse(LogExecutionTime.class.getAnnotation(LogExecutionTime.class).value()), "add() method took " + duration + " milliseconds to execute");

        // Return the result
        return result;
    }
}

public class UssesInRealTImeCode {
    public static void main(String[] args) {
         // Creating an object of Calculator class
         Calculator calculator = new Calculator();

         // Calling the add() method and printing the result
         int sum = calculator.add(10, 20);
         System.out.println("Sum = " + sum);
    }
    
}
