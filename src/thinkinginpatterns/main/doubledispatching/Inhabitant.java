package thinkinginpatterns.main.doubledispatching;

public interface Inhabitant {
    void interactInhabitant(Inhabitant it);
    void interact(Dwarf d);
    void interact(Elf e);
    void interact(Troll t);
}
