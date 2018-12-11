package main;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class NumbersSumRecursiveTask extends RecursiveTask<Integer> {


    private List<Integer> list;

    public NumbersSumRecursiveTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (list.size() < 2) {
            return list.stream().mapToInt(x -> x).sum();
        }

        int mid = list.size() / 2;

        List<Integer> list1 = list.subList(0, mid);
        List<Integer> list2 = list.subList(mid, list.size());

        NumbersSumRecursiveTask t1 = new NumbersSumRecursiveTask(list1);
        NumbersSumRecursiveTask t2 = new NumbersSumRecursiveTask(list2);

        t2.fork();

        return  t1.compute() + t2.join();
    }
}
