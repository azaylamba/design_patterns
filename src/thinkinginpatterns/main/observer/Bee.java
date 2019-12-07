package thinkinginpatterns.main.observer;

import java.util.Observable;
import java.util.Observer;

public class Bee {
    private String name;
    private OpenObserver openObserver = new OpenObserver();
    private CloseObserver closeObserver = new CloseObserver();
    public Bee(String name) {
        this.name = name;
    }

    //An inner class for observing openings
    private class OpenObserver implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("Bee " + name + "'s breakfast time");
        }
    }
    //An inner class for observing closings
    private class CloseObserver implements Observer {

        @Override
        public void update(Observable o, Object arg) {
            System.out.println("Bee " + name + "'s bed time");
        }
    }

    public Observer openObserver() {
        return openObserver;
    }
    public Observer closeObserver() {
        return closeObserver;
    }
}
