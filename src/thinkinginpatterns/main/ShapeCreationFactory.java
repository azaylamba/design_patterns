package thinkinginpatterns.main;

public interface ShapeCreationFactory {
    Shape create(String shape) throws BadShapeCreation;
}
