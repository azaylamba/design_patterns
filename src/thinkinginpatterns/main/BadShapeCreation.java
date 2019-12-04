package thinkinginpatterns.main;

/**
 * A class to throw appropriate exception in case factory is failed to create requested shape.
 *
 */
public class BadShapeCreation extends Exception {

    public BadShapeCreation(String msg) {
        super(msg);
    }
}
