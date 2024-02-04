package AnnotationExample;

// A custom annotation to mark a method as a test case
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // This annotation can be applied to methods
@Retention(RetentionPolicy.RUNTIME) // This annotation should be retained at runtime
@interface TestCase {
    // A value to specify the expected output of the test case
    String expected();
}

// A class that uses the custom annotation
public class CalculatorTest {

    // A method that is annotated with @TestCase
    @TestCase(expected = "30")
    public int add(int a, int b) {
        // Perform some computation
        int result = a + b;
        // Return the result
        return result;
    }

    // A method that is annotated with @TestCase
    @TestCase(expected = "200")
    public int multiply(int a, int b) {
        // Perform some computation
        int result = a * b;
        // Return the result
        return result;
    }
}

// A class that tests the custom annotation
import java.lang.reflect.Method;

public class TestRunner {

    public static void main(String[] args) {
        // Create an object of CalculatorTest class
        CalculatorTest calculatorTest = new CalculatorTest();

        // Get the declared methods of the class
        Method[] methods = CalculatorTest.class.getDeclaredMethods();

        // Loop through the methods
        for (Method method : methods) {
            // Check if the method is annotated with @TestCase
            if (method.isAnnotationPresent(TestCase.class)) {
                // Get the annotation object
                TestCase testCase = method.getAnnotation(TestCase.class);
                // Get the expected output from the annotation
                String expected = testCase.expected();
                try {
                    // Invoke the method with some sample inputs
                    Object actual = method.invoke(calculatorTest, 10, 20);
                    // Compare the actual output with the expected output
                    if (expected.equals(actual.toString())) {
                        // Print the test case result
                        System.out.println("Test case passed for method: " + method.getName());
                    } else {
                        // Print the test case result
                        System.out.println("Test case failed for method: " + method.getName());
                        System.out.println("Expected: " + expected + ", Actual: " + actual);
                    }
                } catch (Exception e) {
                    // Handle any exception
                    e.printStackTrace();
                }
            }
        }
    }
}

