package thinkinginpatterns.main;

public abstract class Shape {

    public abstract void draw();
    public abstract void erase();

    public static Shape factory(String shape) throws BadShapeCreation {
        if("Circle".equals(shape)) {
            return new Circle();
        } else if("Square".equals(shape)) {
            return new Square();
        } else if ("Triangle".equals(shape)) {
            return new Triangle();
        } else {
            throw new BadShapeCreation(shape);
        }
    }

    public static Shape factory(String type, String shape) throws BadShapeCreation {
        if("Circle".equals(shape)) {
            return new Circle(type);
        } else if("Square".equals(shape)) {
            return new Square(type);
        } else if ("Triangle".equals(shape)) {
            return new Triangle(type);
        } else {
            throw new BadShapeCreation(shape);
        }
    }
}
