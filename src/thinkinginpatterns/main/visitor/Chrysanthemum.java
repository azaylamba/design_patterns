package thinkinginpatterns.main.visitor;

public class Chrysanthemum implements Flower {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
