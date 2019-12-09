package thinkinginpatterns.main.patternrefactoring;

public class Glass extends Trash {
    static double val = 0.23f;
    public Glass(double wt) {
        super(wt);
    }
    @Override
    double getValue() {
        return 0;
    }

    public static void setVal(double newVal) {
        val = newVal;
    }
}
