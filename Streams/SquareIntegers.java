package Streams;

import java.util.Arrays;
import java.util.List;

public class SquareIntegers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int SumOfSq = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

                System.out.println("The sum of the squares of the numbers is: "+ SumOfSq);
    }

}
