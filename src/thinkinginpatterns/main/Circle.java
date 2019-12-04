package thinkinginpatterns.main;

public class Circle extends Shape {
    String type;
    public Circle() {
    }
    public Circle(String type) {
        this.type = type;
    }

    @Override
    public void draw() {
        if(null != type) {
            System.out.println(type + " Circle.draw()");
        } else {
            System.out.println("Circle.draw()");
        }
    }

    @Override
    public void erase() {
        if(null != type) {
            System.out.println(type + " Circle.erase()");
        } else {
            System.out.println("Circle.erase()");
        }
    }
}
