package thinkinginpatterns.test.visitor;

import thinkinginpatterns.main.visitor.Bee;
import thinkinginpatterns.main.visitor.Flower;
import thinkinginpatterns.main.visitor.FlowerGenerator;
import thinkinginpatterns.main.visitor.StringVal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeesAndFlowers {
    List flowers = new ArrayList();
    public BeesAndFlowers() {
        for (int i=0; i<10; i++) {
            flowers.add(FlowerGenerator.newFlower());
        }
    }
    public void test() {
        StringVal sVal = new StringVal();
        Iterator itr = flowers.iterator();
        while (itr.hasNext()) {
            ((Flower) itr.next()).accept(sVal);
            System.out.println(sVal);
        }
        //Perform Bee operation on all Flowers
        Bee bee = new Bee();
        itr = flowers.iterator();
        while (itr.hasNext()) {
            ((Flower)itr.next()).accept(bee);
        }
    }

    public static void main(String[] args) {
        new BeesAndFlowers().test();
    }
}
