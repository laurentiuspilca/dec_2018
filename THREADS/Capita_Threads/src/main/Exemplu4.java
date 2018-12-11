package main;

import java.util.List;
import java.util.concurrent.*;

public class Exemplu4 {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

        Runnable r = () -> System.out.println(":)");
        Future<?> f =service.schedule(r, 100, TimeUnit.DAYS);
        service.scheduleAtFixedRate(r, 10, 100, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(r, 10, 100, TimeUnit.SECONDS);

    }
}
