package thinkinginpatterns.main;

public class Kitty implements Player {

    @Override
    public void interactsWith(Obstacle ob) {
        System.out.print("Kitty has encountered a ");
        ob.action();
    }
}
