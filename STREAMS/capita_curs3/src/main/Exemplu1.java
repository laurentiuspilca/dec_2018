package main;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Predicate<T> --> boolean test(T a)
 * BiPredicate<T,G> --> boolean test(T a, T b)
 * Supplier<T> -->  T get()
 * Function<T, R> --> R apply(T a)
 * BiFunction<T, G, R> --> R apply(T a, G b)
 * Consumer<T> --> void accept(T a)
 * BiConsumer<T, G> --> void accept(T a, G b)
 * UnaryOperator<T> --> T apply(T a)
 * BinaryOperator<T> --> T apply(T a, T b)
 */
public class Exemplu1 {

    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.empty();
        Stream<Integer> s2 = Stream.iterate(0, i -> i + 1);

        s2.limit(10).forEach(System.out::println);
        // ::

        Map<Integer, String> m = new HashMap<>();
        m.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
