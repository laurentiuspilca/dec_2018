package main;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// R >>>>>
// W <<<<<
// R / W        1000 / 1
public class Numar {

    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private int i;

    public void increment() { // mutator, writer
        try {
            lock.writeLock().lock();
            i = i + 1;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int get() { // reader
        try {
            lock.readLock().unlock();
            return i;
        } finally {
            lock.readLock().unlock();
        }
    }
}
