package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplu9 {



    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        final List<Integer> res = new ArrayList<>();

        list.stream().filter(x -> x % 2 == 0).forEach(x -> res.add(x));
    }
}
