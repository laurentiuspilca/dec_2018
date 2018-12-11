package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu5 {
    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("aaaa", "b", "cc", "dddd", "xyz");

        /*
        map() Obj -> Obj
        mapToInt()  Obj -> Int
        mapToLong() Obj -> Long
        mapToDouble() Obj -> Double
        mapToObject()

         */
        int sum =
                list.stream()
                        .mapToInt(s -> s.length())
                        .filter(n -> n % 2 == 0)
                        .sum();

        System.out.println(sum);
    }
}
