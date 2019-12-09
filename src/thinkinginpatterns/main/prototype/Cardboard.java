package thinkinginpatterns.main.prototype;

public class Cardboard extends Trash {
    private static double val = 0.23f;
    public Cardboard(double wt) {
        super(wt);
    }
    @Override
    public double getValue() {
        return val;
    }

    public static void setValue(double newVal) {
        val = newVal;
    }
}
