package thinkinginpatterns.main.visitortrash;

import thinkinginpatterns.main.prototype.Trash;

public class FillableVisitor implements Fillable {
    private Fillable f;
    public FillableVisitor(Fillable ff) {
        f = ff;
    }
    @Override
    public void addTrash(Trash t) {
        f.addTrash(new VisitableDecorator(t));
    }
}
