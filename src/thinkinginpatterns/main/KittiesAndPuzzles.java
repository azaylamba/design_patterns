package thinkinginpatterns.main;

/**
 * The concrete factory which actually creates objects.
 *
 */
public class KittiesAndPuzzles implements GameElementFactory {
    @Override
    public Player makePlayer() {
        return new Kitty();
    }
    @Override
    public Obstacle makeObstacle() {
        return new Puzzle();
    }
}
