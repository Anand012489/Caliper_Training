package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStringg {

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
        Map<Integer, Long> lengthCounts = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        
                System.out.println("Length Counts: " + lengthCounts);
    }

}
