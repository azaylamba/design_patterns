package thinkinginpatterns.test.doubledispatching;

import thinkinginpatterns.main.doubledispatching.Inhabitant;
import thinkinginpatterns.main.doubledispatching.InhabitantGenerator;

import java.util.ArrayList;
import java.util.List;

public class ProjectInhabitant {
    List<Inhabitant> inhabitants = new ArrayList<>();
    public ProjectInhabitant() {
        for (int i=0; i<10; i++) {
            inhabitants.add(InhabitantGenerator.getInhabitant());
        }
    }
    public void test() {
        for (int i=0; i<inhabitants.size()/2; i++) {
            inhabitants.get(i).interactInhabitant((Inhabitant)inhabitants.get(i*2));
        }
    }

    public static void main(String[] args) {
        new ProjectInhabitant().test();
    }
}
