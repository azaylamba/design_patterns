package thinkinginpatterns.main;

public class KungfuGuy implements Player {

    @Override
    public void interactsWith(Obstacle ob) {
        System.out.print("Kungfu guys interacts with a ");
        ob.action();
    }
}
