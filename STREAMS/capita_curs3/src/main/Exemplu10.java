package main;

import java.util.function.Predicate;

public class Exemplu10 {

    public static void main(String[] args) {
        int x = 10;

        Predicate<Integer> p =
            new Predicate<Integer>() {

                @Override
                public boolean test(Integer integer) {
                    int y = 10;
                    return false;
                }
            };
    }
}
