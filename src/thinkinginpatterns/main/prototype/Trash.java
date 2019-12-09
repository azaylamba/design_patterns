package thinkinginpatterns.main.prototype;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Trash {
    private double weight;
    public Trash(double wt) {
        weight = wt;
    }
    public Trash() {
    }

    public abstract double getValue();

    public double getWeight() {
        return weight;
    }

    //Sums the value of Trash given to an iterator to any container of Trash
    public static void sumValue(Iterator it) {
        double val = 0.0f;
        while (it.hasNext()) {
            Trash t = (Trash) it.next();
            val += t.getWeight() * t.getValue();
            System.out.println("weight of " + t.getClass().getSimpleName() + " = " + t.getWeight());
        }
        System.out.println("Total value = " + val);
    }

    //Remainder of class provides support for prototyping
    public static class PrototypeNotFoundException extends Exception {};
    public static class CannotCreateTrashException extends Exception {};

    private static List trashTypes = new ArrayList();

    public static Trash factory(Messanger info) throws PrototypeNotFoundException, CannotCreateTrashException {
        for(int i=0; i<trashTypes.size(); i++) {
            Class tc = (Class) trashTypes.get(i);
            if(tc.getName().indexOf(info.id) != -1) {
                try {
                    //Get the dynamic constructor that takes a double argument
                    Constructor ctor = tc.getConstructor(new Class[] {double.class});
                    //Call the constructor to create a new object
                    return (Trash) ctor.newInstance(new Object[] {new Double(info.data)});
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                    throw new CannotCreateTrashException();
                }
            }
        }
        //Class was not in the list. Try to load it, but it must be in your class path!
        try {
            System.out.println("Loading " + info.id);
            trashTypes.add(Class.forName(info.id));

        } catch (Exception e) {
            e.printStackTrace(System.err);
            throw new PrototypeNotFoundException();
        }
        //Loaded successfully, recursive call should work
        return factory(info);
    }
}
