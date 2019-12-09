package thinkinginpatterns.main.patternrefactoring;

public class Aluminium extends Trash {
    static double val = 1.67f;
    public Aluminium(double wt) {
        super(wt);
    }
    @Override
    double getValue() {
        return val;
    }

    public static void setVal(double newVal) {
        val = newVal;
    }
}
