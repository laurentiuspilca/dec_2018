package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,6,7,8);
        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
