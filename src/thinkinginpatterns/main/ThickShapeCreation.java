package thinkinginpatterns.main;

public class ThickShapeCreation implements ShapeCreationFactory {

    @Override
    public Shape create(String shape) throws BadShapeCreation {
        return Shape.factory("Thick", shape);
    }
}
