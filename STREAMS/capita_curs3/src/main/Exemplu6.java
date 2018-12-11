package main;

import java.util.*;
import java.util.stream.Collectors;

public class Exemplu6 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "aaa", "bbb", "qqqq", "e" ,"ttttt", "t");

        // Collector ---> Collectors

        HashSet<Integer> res =
            list.stream()
                    .map(s -> s.length())
                    .collect(Collectors.toCollection(HashSet::new));
        // () -> new HashSet<>()

        Map<String, Integer> map =
                list.stream()
                    .collect(Collectors.toMap(s -> s, s -> s.length()));

        String s = list.stream().collect(Collectors.joining(","));

        //long nr = list.stream().collect(Collectors.counting());
        long nr = list.stream().count();

        // Map <Integer, List<String> >

        Map<Integer, Long> m2 =
            list.stream()
                    .filter(t -> t.length() % 2 == 0)
                    .limit(10)
                    .collect(
                    Collectors.groupingBy(q -> q.length(), Collectors.counting()
                    ));

        System.out.println(m2);

        //m2.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
