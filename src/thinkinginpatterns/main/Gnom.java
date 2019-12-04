package thinkinginpatterns.main;

public class Gnom implements Player {

    @Override
    public void interactsWith(Obstacle ob) {
        System.out.print("Gnom interacts with a ");
        ob.action();
    }
}
