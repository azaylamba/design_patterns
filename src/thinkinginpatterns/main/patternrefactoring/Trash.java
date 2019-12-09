package thinkinginpatterns.main.patternrefactoring;

import java.util.Collection;
import java.util.Iterator;

public abstract class Trash {
    private double weight;
    public Trash(Double wt) {
        weight = wt;
    }
    abstract double getValue();
    public double getWeight() {
        return weight;
    }
    //Sums the value of trash in a bin
    public static void sumValue(Collection bin) {
        Iterator e = bin.iterator();
        double val = 0.0f;
        while (e.hasNext()) {
            Trash t = (Trash) e.next();
            val += t.getWeight() * t.getValue();
            System.out.println("weight of " + t.getClass().getName() + " = " + t.getWeight());
        }
        System.out.println("Total value = " + val);
    }
}
