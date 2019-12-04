package thinkinginpatterns.main;

/**
 * The abstract factory.
 *
 */
public interface GameElementFactory {
    public Player makePlayer();
    public Obstacle makeObstacle();
}
