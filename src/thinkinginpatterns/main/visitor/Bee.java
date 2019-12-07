package thinkinginpatterns.main.visitor;

/**
 * Add the ability to Bee activities
 */
public class Bee implements Visitor {

    @Override
    public void visit(Gladiolus g) {
        System.out.println("Bee and Gladiolus");
    }

    @Override
    public void visit(Renuculus r) {
        System.out.println("Bee and Renuculus");
    }

    @Override
    public void visit(Chrysanthemum c) {
        System.out.println("Bee and Chrysanthemum");
    }
}
