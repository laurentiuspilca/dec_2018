package main;

import java.util.stream.Stream;

public class Exemplu2 {

    public static void main(String[] args) {
        Stream<Integer> s2 = Stream.iterate(0, i -> i + 1);

//        s2.filter(x -> x % 2 == 0)
//        s2.filter(x -> Exemplu2.evenNumbersFilter(x))
        s2.filter(Exemplu2::evenNumbersFilter)
                .limit(10)
                .forEach(System.out::println);


    }

    private static boolean evenNumbersFilter(int x) {
        System.out.println(x);
        return x % 2 == 0;
    }
}
