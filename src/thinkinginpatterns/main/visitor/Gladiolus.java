package thinkinginpatterns.main.visitor;

public class Gladiolus implements Flower {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
