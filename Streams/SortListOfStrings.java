package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anand", "Raj", "Rahul", "Kumar");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
