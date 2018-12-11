package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.ExecutorService;

public class MySubject {

    private ExecutorService service;
    private List<MyObserver> observers = new ArrayList<>();

    public void addObserver(MyObserver o) {
        observers.add(o);
    }

    public void fireEvent() {
        observers.forEach(MyObserver::closeTask);
    }
}
