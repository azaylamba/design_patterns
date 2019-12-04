package thinkinginpatterns.main;

public abstract class Shape {

    public abstract void draw();
    public abstract void erase();

    public static Shape factory(String type) throws BadShapeCreation {
        if("Circle".equals(type)) {
            return new Circle();
        } else if("Square".equals(type)) {
            return new Square();
        } else {
            throw new BadShapeCreation(type);
        }
    }
}
