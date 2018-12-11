package main;

import java.util.concurrent.*;

public class Exemplu3 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        Runnable r = () -> System.out.println(":)");
        Callable<String> c = () -> ":(";

        Future<?> f1 = service.submit(r);
        Future<String> f2 = service.submit(c);

        try {
            String res = f2.get();
            System.out.println(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
