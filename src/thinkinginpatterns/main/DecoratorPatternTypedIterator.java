package thinkinginpatterns.main;

import java.util.Iterator;

public class DecoratorPatternTypedIterator implements Iterator {

    private Iterator itr;
    private Class type;
    public DecoratorPatternTypedIterator(Iterator itr, Class type) {
        this.itr = itr;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public void remove() {
        itr.remove();
    }

    @Override
    public Object next() {
        Object next = itr.next();
        if (!type.isInstance(next)) {
            throw new ClassCastException("Typed iterator for type: " + type + " encountered type: " + next.getClass());
        }
        return next;
    }

}
