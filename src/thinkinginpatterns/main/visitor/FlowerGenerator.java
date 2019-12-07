package thinkinginpatterns.main.visitor;

public class FlowerGenerator {
    public static Flower newFlower() {
        switch ((int) (Math.random() * 3)) {
            default:
            case 0:
                return new Gladiolus();
            case 1:
                return new Renuculus();
            case 2:
                return new Chrysanthemum();
        }
    }
}
