package main;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class DoubleNumbersRecursiveAction extends RecursiveAction {

    private final List<Integer> list;

    public DoubleNumbersRecursiveAction(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected void compute() {
        if (list.size() < 2) {
            list.stream().map(i -> 2 *i).forEach(System.out::println);
            return;
        }

        int mid = list.size() / 2;

        List<Integer> list1 = list.subList(0, mid);
        List<Integer> list2 = list.subList(mid, list.size());

        DoubleNumbersRecursiveAction a1 = new DoubleNumbersRecursiveAction(list1);
        DoubleNumbersRecursiveAction a2 = new DoubleNumbersRecursiveAction(list2);

        invokeAll(a1, a2);
    }
}
