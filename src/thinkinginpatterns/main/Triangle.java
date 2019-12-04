package thinkinginpatterns.main;

public class Triangle extends Shape {
    String type;

    public Triangle() {
    }
    public Triangle(String type) {
        this.type = type;
    }
    @Override
    public void draw() {
        if(null != type) {
            System.out.println(type + " Triangle.draw()");
        } else {
            System.out.println("Triangle.draw()");
        }
    }

    @Override
    public void erase(){
        if(null != type) {
            System.out.println(type + " Triangle.erase()");
        } else {
            System.out.println("Triangle.erase()");
        }
    }
}
