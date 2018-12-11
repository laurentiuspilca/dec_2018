package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu4 {

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("aaaa", "b", "cc", "dddd", "xyz");

        int sum =
        list.stream()
                .map(s -> s.length())
                .filter(n -> n % 2 == 0)
                .reduce(0, (a,b) -> a + b);

        System.out.println(sum);
    }
}
