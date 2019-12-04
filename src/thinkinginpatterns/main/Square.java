package thinkinginpatterns.main;

public class Square extends Shape {
    private String type;

    public Square() {
    }
    public Square(String type) {
        this.type = type;
    }
    @Override
    public void draw() {
        if(null != type) {
            System.out.println(type + " Square.draw()");
        } else {
            System.out.println("Square.draw()");
        }
    }

    @Override
    public void erase() {
        if(null != type) {
            System.out.println(type + " Square.erase()");
        } else {
            System.out.println("Square.erase()");
        }
    }
}
