package thinkinginpatterns.main.doubledispatching;

/**
 * A weapon used by Elf.
 *
 */
public class SellImaginaryProduct implements Weapon {
    @Override
    public Outcome compete(Weapon wp) {
        return wp.fight(this);
    }

    @Override
    public Outcome fight(Jargon jr) {
        return Outcome.WIN;
    }

    @Override
    public Outcome fight(Play p) {
        return Outcome.LOSE;
    }

    @Override
    public Outcome fight(InventFeature ef) {
        return Outcome.DRAW;
    }

    @Override
    public Outcome fight(SellImaginaryProduct sp) {
        return Outcome.DRAW;
    }

    @Override
    public Outcome fight(Edict e) {
        return Outcome.LOSE;
    }

    @Override
    public Outcome fight(Schedule sc) {
        return Outcome.WIN;
    }
}
