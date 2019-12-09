package thinkinginpatterns.main.visitortrash;

import thinkinginpatterns.main.prototype.Aluminium;
import thinkinginpatterns.main.prototype.Glass;
import thinkinginpatterns.main.prototype.Paper;
import thinkinginpatterns.main.prototype.Cardboard;

public interface Visitor {
    void visit(Aluminium a);
    void visit(Glass g);
    void visit(Paper p);
    void visit(Cardboard c);
}
