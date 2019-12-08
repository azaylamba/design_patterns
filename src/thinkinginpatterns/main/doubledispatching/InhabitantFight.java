package thinkinginpatterns.main.doubledispatching;

import java.util.ArrayList;
import java.util.List;

/**
 * A class where simulate a situation where groups inhabitants will meet to fight randomly.
 * Fight will continue until one group is victorious.
 *
 */
public class InhabitantFight {
    List<Inhabitant> inhabitants = new ArrayList<>();
    int deadDwarfs = 0;
    int deadElfs = 0;
    int deadTrolls = 0;
    public InhabitantFight() {
        for (int i = 0; i < 15; i++) {
            if(i<5) {
                inhabitants.add(new Dwarf());
            } else if(i < 10) {
                inhabitants.add(new Elf());
            } else {
                inhabitants.add(new Troll());
            }
        }
    }
    private boolean allDwarfsdead() {
        return deadDwarfs == 5;
    }
    private boolean allElfsDead() {
        return deadElfs == 5;
    }
    private boolean allTrollsDead() {
        return deadTrolls == 5;
    }
    private boolean dwarfsWon() {
        return allElfsDead() && allTrollsDead();
    }
    private boolean elfsWon() {
        return allDwarfsdead() && allTrollsDead();
    }
    private boolean trollsWon() {
        return allDwarfsdead() && allElfsDead();
    }

    /**
     * Updates count of dead inhabitants and remove them from original list.
     *
     * @param inhabitants
     * @param outcome
     * @param a
     * @param b
     */
    private void updateDeadCounts(List<Inhabitant> inhabitants, Outcome outcome, Inhabitant a, Inhabitant b) {
        if(outcome == Outcome.DRAW) {
            //Inhabitants of same group fought
            return;
        } else if(a instanceof Dwarf) {
            if (outcome == Outcome.LOSE) {//A Dwarf down here
                deadDwarfs++;
                inhabitants.remove(a);
            } else if(b instanceof Elf) {//An Elf down here
                deadElfs++;
                inhabitants.remove(b);
            } else if(b instanceof Troll) {//A Troll down here
                deadTrolls++;
                inhabitants.remove(b);
            }
        } else if(a instanceof Elf ) {
            if(outcome == Outcome.LOSE) {//An Elf down here
                deadElfs++;
                inhabitants.remove(a);
            } else if(b instanceof Dwarf) {//A Dwarf down here
                deadDwarfs++;
                inhabitants.remove(b);
            } else if(b instanceof Troll) {//A Troll down here
                deadTrolls++;
                inhabitants.remove(b);
            }
        } else {
            if(outcome == Outcome.LOSE) {//A Troll down here
                deadTrolls++;
                inhabitants.remove(a);
            } else if(b instanceof Dwarf) {//A Dwarf down here
                deadDwarfs++;
                inhabitants.remove(b);
            } else if(b instanceof Elf) {//An Elf down here
                deadElfs++;
                inhabitants.remove(b);
            }
        }
    }

    /**
     * A function to randomly chose two inhabitants from the list to compete with each other.
     * The losing inhabitant is removed from the list and dead count is increased for that group.
     */
    public void meeting() {
        while(!dwarfsWon() && !elfsWon() && !trollsWon()) {
            int index1 = ((int) (Math.random() * 15)) % inhabitants.size();
            int index2 = ((int) (Math.random() * 15)) % inhabitants.size();
            Inhabitant inhabitant1 = inhabitants.get(index1);
            Inhabitant inhabitant2 = inhabitants.get(index2);
            Outcome outcome = Compete.battle(inhabitant1, inhabitant2);
            updateDeadCounts(inhabitants, outcome, inhabitant1, inhabitant2);
        }
        if(dwarfsWon()) {
            System.out.println("Dwarfs Won!!");
        } else if(elfsWon()) {
            System.out.println("Elfs Won!!");
        } else {
            System.out.println("Trolls Won!!");
        }
    }
}
