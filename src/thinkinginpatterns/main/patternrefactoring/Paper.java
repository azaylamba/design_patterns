package thinkinginpatterns.main.patternrefactoring;

public class Paper extends Trash {
    static double val = 0.10f;
    public Paper(double wt) {
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
