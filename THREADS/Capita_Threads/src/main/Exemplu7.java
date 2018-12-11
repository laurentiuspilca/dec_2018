package main;

import java.util.concurrent.Semaphore;

public class Exemplu7 {

    public static void main(String[] args) {
        // Semaphore, ReadWriteLock, CyclicBarrier

        Semaphore s = new Semaphore(1);

        try {
            s.acquire(); // 2
            // blocul sincronizat -------
        } catch (InterruptedException e) {

        } finally {
            s.release();
        }

    }
}
