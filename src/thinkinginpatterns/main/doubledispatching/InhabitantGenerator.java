package thinkinginpatterns.main.doubledispatching;

public class InhabitantGenerator {
    public static Inhabitant getInhabitant() {
        switch ((int) (Math.random() * 3)) {
            default:
            case 0:
                return new Dwarf();
            case 1:
                return new Elf();
            case 2:
                return new Troll();
        }
    }
}
