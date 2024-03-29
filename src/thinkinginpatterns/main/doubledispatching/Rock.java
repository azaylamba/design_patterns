package thinkinginpatterns.main.doubledispatching;

public class Rock implements Item {
    @Override
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    @Override
    public Outcome eval(Paper p) {
        return Outcome.WIN;
    }

    @Override
    public Outcome eval(Scissors s) {
        return Outcome.LOSE;
    }

    @Override
    public Outcome eval(Rock r) {
        return Outcome.DRAW;
    }

    public String toString() {
        return "Rock";
    }
}
