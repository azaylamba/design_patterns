package thinkinginpatterns.main.visitor;

public class Renuculus implements Flower {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
