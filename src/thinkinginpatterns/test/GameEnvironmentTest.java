package thinkinginpatterns.test;

import thinkinginpatterns.main.GameElementFactory;
import thinkinginpatterns.main.GameEnvironment;
import thinkinginpatterns.main.KillAndDismember;
import thinkinginpatterns.main.KittiesAndPuzzles;

/**
 * A test class to test abstract factory pattern.
 *
 */
public class GameEnvironmentTest {
    public static void main(String[] args) {
        GameElementFactory kp = new KittiesAndPuzzles();
        GameElementFactory kd = new KillAndDismember();
        GameEnvironment g1 = new GameEnvironment(kp);
        GameEnvironment g2 = new GameEnvironment(kd);
        g1.play();
        g2.play();
    }

}
