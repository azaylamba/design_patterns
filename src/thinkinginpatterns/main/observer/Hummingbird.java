package thinkinginpatterns.main.observer;

import java.util.Observable;
import java.util.Observer;

public class Hummingbird {
    private String name;
    private OpenObserver openObserver = new OpenObserver();
    private CloseObserver closeObserver = new CloseObserver();

    public Hummingbird(String nm) {
        name = nm;
    }

    public OpenObserver openObserver() {
        return openObserver;
    }
    public CloseObserver closeObserver() {
        return closeObserver;
    }

    //An inner class to observe openings
    private class OpenObserver implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("Hummingbird " + name + "'s breakfast time!");
        }
    }
    //An inner class to observe closings
    private class CloseObserver implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("Hummingbird " + name + "'s bed time");
        }
    }
}
