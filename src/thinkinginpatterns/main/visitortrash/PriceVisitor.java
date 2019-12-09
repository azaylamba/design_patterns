package thinkinginpatterns.main.visitortrash;

import thinkinginpatterns.main.prototype.Aluminium;
import thinkinginpatterns.main.prototype.Glass;
import thinkinginpatterns.main.prototype.Paper;
import thinkinginpatterns.main.prototype.Cardboard;

public class PriceVisitor implements Visitor {
    private double alSum;
    private double pSum;
    private double gSum;
    private double cSum;
    @Override
    public void visit(Aluminium a) {
        double v = a.getWeight() * a.getValue();
        System.out.println("value of aluminium = " + v);
        alSum += v;
    }

    @Override
    public void visit(Glass g) {
        double v = g.getWeight() * g.getValue();
        System.out.println("value of glass = " + v);
        gSum += v;
    }

    @Override
    public void visit(Paper p) {
        double v = p.getWeight() * p.getValue();
        System.out.println("value of paper = " + v);
        pSum += v;
    }

    @Override
    public void visit(Cardboard c) {
        double v = c.getWeight() * c.getValue();
        System.out.println("value of cardboard = " + v);
        cSum += v;
    }

    void total() {
        System.out.println("Total aluminium: " + alSum + "\n" +
                "Total paper: " + pSum + "\n" +
                "Total glass: " + gSum + "\n" +
                "Total cardboard: " + cSum);
    }
}
