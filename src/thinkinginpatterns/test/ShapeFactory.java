package thinkinginpatterns.test;

import thinkinginpatterns.main.BadShapeCreation;
import thinkinginpatterns.main.Shape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeFactory {
    public static void main(String[] args) {
        new ShapeFactory().test();
    }
    String[] sList = {"Circle", "Square", "Square", "Circle", "Circle", "Square", "NotAShape"};
    List<Shape> shapes = new ArrayList<>();

    public void test() {
        try {
            for(int i=0; i<sList.length; i++) {
                shapes.add(Shape.factory(sList[i]));
            }
        } catch (BadShapeCreation e) {
            System.out.println("Shape creation failed!! for: " + e.getMessage());
        }
        Iterator itr = shapes.iterator();
        while (itr.hasNext()) {
            Shape s = (Shape) itr.next();
            s.draw();
            s.erase();
        }
    }
}
