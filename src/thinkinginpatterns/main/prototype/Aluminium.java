package thinkinginpatterns.main.prototype;

public class Aluminium extends Trash {
    private  static double val = 1.67f;
    public Aluminium(double wt) {
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
