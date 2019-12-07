package thinkinginpatterns.test.observer;

import thinkinginpatterns.main.observer.Bee;
import thinkinginpatterns.main.observer.Flower;
import thinkinginpatterns.main.observer.Hummingbird;

/**
 * A class to test Observer pattern.
 *
 */
public class FlowerTest {

    public static void main(String[] args) {
        Flower f = new Flower();
        Bee ba = new Bee("A"), bb = new Bee("B");
        Hummingbird ha = new Hummingbird("A"), hb = new Hummingbird("B");
        f.opening().addObserver(ha.openObserver());
        f.opening().addObserver(hb.openObserver());
        f.opening().addObserver(ba.openObserver());
        f.opening().addObserver(bb.openObserver());
        f.closing().addObserver(ha.closeObserver());
        f.closing().addObserver(hb.closeObserver());
        f.closing().addObserver(ba.closeObserver());
        f.closing().addObserver(bb.closeObserver());
        //Hummingbird B decides to sleep
        f.opening().deleteObserver(hb.openObserver());
        //A change that interests observers
        f.open();
        f.open();//its already open, so no change
        //Bee A doesn't want to go to bed
        f.closing().deleteObserver(ba.closeObserver());

        f.close();
        f.close();
        f.opening().deleteObservers();
        f.open();
        f.close();
    }

}
