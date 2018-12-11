package main;


import java.util.concurrent.RecursiveTask;

/*
0 1 1 2 3 5 8 13

f(n) = f(n-1) + f (n-2)
 */
public class FibonnaciTask extends RecursiveTask<Integer> {

    private int n;

    public FibonnaciTask(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if (n < 2) {
            return n;
        }

        FibonnaciTask f1 = new FibonnaciTask(n-1);
        FibonnaciTask f2 = new FibonnaciTask(n-2);

        f1.fork();

        return f2.compute() + f1.join();
    }
}
