package thinkinginpatterns.main;

public class KillAndDismember implements GameElementFactory {
    @Override
    public Player makePlayer() {
        return new KungfuGuy();
    }
    @Override
    public Obstacle makeObstacle() {
        return new NastyWeapon();
    }
}
