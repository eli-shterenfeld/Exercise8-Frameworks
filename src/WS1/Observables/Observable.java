package WS1.Observables;// Observable.java
import WS1.Observers.Observer;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(int data) {
        for (Observer o : observers) {
            o.update(data);
        }
    }
}