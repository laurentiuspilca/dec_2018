package main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu2 {

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println(":)");
        Callable<String> c1 = () -> ":(";

        // Executor, ExecutorService, ScheduledExecutorService
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            service.execute(r1);
        }

    }
}
