package thinkinginpatterns.main.doubledispatching;

public class Compete {
    public static Outcome match(Item a, Item b) {
        System.out.print(a + " <--> " + b + " : ");
        return a.compete(b);
    }
}
