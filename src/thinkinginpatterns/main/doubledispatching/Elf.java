package thinkinginpatterns.main.doubledispatching;

public class Elf implements Inhabitant {

    @Override
    public void interactInhabitant(Inhabitant it) {
        it.interact(this);
    }

    @Override
    public void interact(Dwarf d) {
        System.out.println("Elf interacting with Dwarf");
    }

    @Override
    public void interact(Elf e) {
        System.out.println("Elf interacting with itself");
    }

    @Override
    public void interact(Troll t) {
        System.out.println("Elf interacting with Troll");
    }

    public String toString() {
        return "Elf";
    }
}
