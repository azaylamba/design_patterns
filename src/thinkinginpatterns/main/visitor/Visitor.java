package thinkinginpatterns.main.visitor;

public interface Visitor {
    void visit(Gladiolus g);
    void visit(Renuculus r);
    void visit(Chrysanthemum c);
}
