package thinkinginpatterns.main.visitortrash;

import thinkinginpatterns.main.prototype.Aluminium;
import thinkinginpatterns.main.prototype.Cardboard;
import thinkinginpatterns.main.prototype.Glass;
import thinkinginpatterns.main.prototype.Paper;

public class WeightVisitor implements Visitor {
    private double alSum; // Aluminum
    private double pSum; // Paper
    private double gSum; // Glass
    private double cSum; // Cardboard

    @Override
    public void visit(Aluminium a) {
        alSum += a.getWeight();
        System.out.println("weight of Aluminum = " + a.getWeight());
    }

    @Override
    public void visit(Glass g) {
        gSum += g.getWeight();
        System.out.println("weight of Glass = " + g.getWeight());
    }

    @Override
    public void visit(Paper p) {
        pSum += p.getWeight();
        System.out.println("weight of Paper = " + p.getWeight());
    }

    @Override
    public void visit(Cardboard c) {
        cSum += c.getWeight();
        System.out.println("weight of Cardboard = " + c.getWeight());
    }

    void total() {
        System.out.println("Total weight Aluminum:" + alSum);
        System.out.println("Total weight Paper:" + pSum);
        System.out.println("Total weight Glass:" + gSum);
        System.out.println("Total weight Cardboard:" + cSum);
    }
}
