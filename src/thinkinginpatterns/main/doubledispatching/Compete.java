package thinkinginpatterns.main.doubledispatching;

public class Compete {
    public static Outcome match(Item a, Item b) {
        System.out.print(a + " <--> " + b + " : ");
        return a.compete(b);
    }

    /**
     * A function where two inhabitants fight with each other using random weapons.
     *
     * @param a
     * @param b
     * @return
     */
    public static Outcome battle(Inhabitant a, Inhabitant b) {
        System.out.println(a + " <--> " + b + " : ");
        return a.getWeapon().compete(b.getWeapon());
    }
}
