package thinkinginpatterns.main.doubledispatching;

public class Dwarf implements Inhabitant {

    @Override
    public void interactInhabitant(Inhabitant it) {
        it.interact(this);
    }

    @Override
    public void interact(Dwarf d) {
        System.out.println("Dwarf interacting with itself");
    }

    @Override
    public void interact(Elf e) {
        System.out.println("Dwarf interacting with Elf");
    }

    @Override
    public void interact(Troll t) {
        System.out.println("Dwarf interacting with Troll");
    }

    public String toString() {
        return "Dwarf";
    }
}
