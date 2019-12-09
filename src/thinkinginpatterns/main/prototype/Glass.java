package thinkinginpatterns.main.prototype;

public class Glass extends Trash {
    private static double val = 0.10f;
    public Glass(double wt) {
        super(wt);
    }
    @Override
    public double getValue() {
        return 0;
    }

    public static void setValue(double newVal) {
        val = newVal;
    }
}
