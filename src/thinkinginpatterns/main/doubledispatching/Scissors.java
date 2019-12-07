package thinkinginpatterns.main.doubledispatching;

import com.sun.corba.se.impl.orbutil.ObjectUtility;

public class Scissors implements Item {
    @Override
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    @Override
    public Outcome eval(Paper p) {
        return Outcome.LOSE;
    }

    @Override
    public Outcome eval(Scissors s) {
        return Outcome.DRAW;
    }

    @Override
    public Outcome eval(Rock r) {
        return Outcome.WIN;
    }

    public String toString() {
        return "Scissors";
    }
}
