package thinkinginpatterns.main.patternrefactoring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RecycleA {
    Collection bin = new ArrayList(),
            glassBin = new ArrayList(),
            paperBin = new ArrayList(),
            alBin = new ArrayList();
    public RecycleA() {
        //Fill up the trash bin
        for(int i=0; i<30; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0:
                    bin.add(new Aluminium(Math.random() * 100));
                    break;
                case 1:
                    bin.add(new Paper(Math.random() * 100));
                    break;
                case 2:
                    bin.add(new Glass(Math.random() * 100));
                    break;
            }
        }
    }

    /**
     * Added parameter just for sake of creating new constructor which uses different
     */
    public RecycleA(String newWay) {
        for(int i=0; i<30; i++) {
            bin.add(Trash.factory(new Messanger(((int) (Math.random() * 100)), Math.random() * 100)));
        }
    }

    public void test() {
        Iterator sorter = bin.iterator();
        //sort the trash
        while (sorter.hasNext()) {
            Object t = sorter.next();
            if(t instanceof Aluminium) {
                alBin.add(t);
            }
            if (t instanceof Paper) {
                paperBin.add(t);
            }
            if(t instanceof Glass) {
                glassBin.add(t);
            }
        }
        Trash.sumValue(alBin);
        Trash.sumValue(paperBin);
        Trash.sumValue(glassBin);
        Trash.sumValue(bin);
    }
}
