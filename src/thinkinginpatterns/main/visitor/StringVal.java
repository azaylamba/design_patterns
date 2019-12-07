package thinkinginpatterns.main.visitor;

/**
 * Add the ability to produce String
 */
public class StringVal implements Visitor {
    String s;
    @Override
    public void visit(Gladiolus g) {
        s = "Gladiolus";
    }

    @Override
    public void visit(Renuculus r) {
        s = "Renuculus";
    }

    @Override
    public void visit(Chrysanthemum c) {
        s = "Chrysanthemum";
    }

    public String toString() {
        return s;
    }
}
