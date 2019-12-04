package thinkinginpatterns.main;

public class GameEnvironment {
    private GameElementFactory gef;
    private Player p;
    private Obstacle ob;
    public GameEnvironment(GameElementFactory factory) {
        gef = factory;
        p = factory.makePlayer();
        ob = factory.makeObstacle();
    }
    public void play() {
        p.interactsWith(ob);
    }
}
