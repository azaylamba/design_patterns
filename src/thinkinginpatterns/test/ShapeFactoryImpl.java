package thinkinginpatterns.test;

import thinkinginpatterns.main.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeFactoryImpl {
    String[] sList = {"Circle", "Square", "Square", "Circle", "Circle", "Square", "NotAShape", "Triangle"};
    List<Shape> shapes = new ArrayList<>();

    public void test() {
        ShapeCreationFactory sc1 = new ThickShapeCreation();
        ShapeCreationFactory sc2 = new ThinShapeCreation();
        for(int i=0; i<sList.length; i++) {
            try {
                shapes.add(sc1.create(sList[i]));
                shapes.add(sc2.create(sList[i]));
            } catch (BadShapeCreation e) {
                System.out.println("Shape creation failed!! for: " + e.getMessage());
            }
        }
        Iterator itr = shapes.iterator();
        while (itr.hasNext()) {
            Shape s = (Shape) itr.next();
            s.draw();
            s.erase();
        }
    }
    public static void main(String[] args) {
        new ShapeFactoryImpl().test();
    }
}
