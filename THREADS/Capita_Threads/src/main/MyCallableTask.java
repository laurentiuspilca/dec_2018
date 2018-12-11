package main;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<String>, MyObserver {

    private boolean shouldClose;

    @Override
    public String call() throws Exception {
        while(!shouldClose) {
            // do smth
        }

        return null;
    }

    @Override
    public void closeTask() {
        shouldClose = true;
    }
}
