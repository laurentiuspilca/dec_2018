package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu8 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.parallelStream()
                .map(x -> Exemplu8.toEuro(new Currency(x)))
                .forEachOrdered(x -> System.out.println(x));
    }

    public static double toEuro(Currency x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        return 4.5 * x.getValue();
    }
}
