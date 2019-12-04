package thinkinginpatterns.main;

/**
 * A concrete factory to create actual objects of {@link Gnom} and {@link Fairy}
 *
 */
public class GnomsAndFairies implements GameElementFactory {
    @Override
    public Player makePlayer() {
        return new Gnom();
    }

    @Override
    public Obstacle makeObstacle() {
        return new Fairy();
    }
}
