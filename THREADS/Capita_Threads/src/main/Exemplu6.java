package main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class Exemplu6 {

    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        // 2 4 6 ...

        ForkJoinPool pool = new ForkJoinPool();
//        pool.invoke(new DoubleNumbersRecursiveAction(list));

        Integer res = pool.invoke(new NumbersSumRecursiveTask(list));
        System.out.println(res);
    }
}
