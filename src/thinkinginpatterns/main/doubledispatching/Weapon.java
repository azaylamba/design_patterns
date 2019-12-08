package thinkinginpatterns.main.doubledispatching;

public interface Weapon {

    Outcome compete(Weapon wp);
    Outcome fight(Jargon jr);
    Outcome fight(Play p);
    Outcome fight(InventFeature ef);
    Outcome fight(SellImaginaryProduct sp);
    Outcome fight(Edict e);
    Outcome fight(Schedule sc);
}
