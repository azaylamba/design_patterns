package thinkinginpatterns.main.doubledispatching;

import java.util.Random;

public class Troll implements Inhabitant {

    @Override
    public void interactInhabitant(Inhabitant it) {
        it.interact(this);
    }

    @Override
    public void interact(Dwarf d) {
        System.out.println("Troll interacts with Dwarf");
    }

    @Override
    public void interact(Elf e) {
        System.out.println("Troll interacts with Elf");
    }

    @Override
    public void interact(Troll t) {
        System.out.println("Troll interacts with itself");
    }

    @Override
    public Weapon getWeapon() {
        if(new Random().nextBoolean()) {
            return new Edict();
        } else {
            return new Schedule();
        }
    }

    public String toString() {
        return "Troll";
    }
}
