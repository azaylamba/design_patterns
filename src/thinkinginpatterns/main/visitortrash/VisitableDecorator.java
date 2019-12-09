package thinkinginpatterns.main.visitortrash;

import thinkinginpatterns.main.prototype.Trash;

import java.lang.reflect.Method;

public class VisitableDecorator extends Trash implements Visitable {
    private Trash delegate;
    private Method dispatch;

    public VisitableDecorator(Trash t) {
        delegate = t;
        try {
            dispatch = Visitor.class.getMethod("visit", new Class[] {t.getClass()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public double getValue() {
        return delegate.getValue();
    }

    @Override
    public double getWeight() {
        return delegate.getWeight();
    }

    @Override
    public void accept(Visitor v) {
        try {
            dispatch.invoke(v, new Object[] {delegate});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
