package thinkinginpatterns.main.doubledispatching;

public class ItemGenerator {
    public static Item newItem() {
        switch ((int) (Math.random() * 3)) {
            default:
            case 0:
                return new Scissors();
            case 1:
                return new Paper();
            case 2:
                return new Rock();
        }
    }
}
