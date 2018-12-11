package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exemplu7 {

    public static void main(String[] args) {
        List<List<String>> list =
                Arrays.asList(
                        Arrays.asList("a","b","c"),
                        Arrays.asList("qqq","rrr","ujh"),
                        Arrays.asList("p","uui","y")
                        );

        Map<Integer, List<String>> res =
            list.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.groupingBy(String::length));

        Predicate<String> p1 = q -> true;
    }
}
