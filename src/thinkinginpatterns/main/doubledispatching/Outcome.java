package thinkinginpatterns.main.doubledispatching;

public class Outcome {
    private int value;
    private String name;

    private Outcome(int val, String nm) {
        value = val;
        name = nm;
    }

    public final static Outcome
            WIN = new Outcome(1, "win"),
            LOSE = new Outcome(2, "lose"),
            DRAW = new Outcome(3, "draw");

    public String toString() {
        return name;
    }

    public boolean equals(Object o) {
        return (o instanceof Outcome) && value == ((Outcome) o).value;
    }
}
