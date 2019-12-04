package thinkinginpatterns.main;

public class ThinShapeCreation implements ShapeCreationFactory {
    @Override
    public Shape create(String shape) throws BadShapeCreation {
        return Shape.factory("Thin", shape);
    }
}
