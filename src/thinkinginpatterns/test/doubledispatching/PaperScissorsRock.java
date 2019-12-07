package thinkinginpatterns.test.doubledispatching;

import thinkinginpatterns.main.doubledispatching.Compete;
import thinkinginpatterns.main.doubledispatching.Item;
import thinkinginpatterns.main.doubledispatching.ItemGenerator;

import java.util.ArrayList;
import java.util.List;

public class PaperScissorsRock {
    List items = new ArrayList();
    public PaperScissorsRock() {
        for (int i=0; i<40; i++) {
            items.add(ItemGenerator.newItem());
        }
    }
    public void test() {
        for (int i = 0; i < items.size() / 2; i++) {
            System.out.println(
                    Compete.match(
                            (Item) items.get(i),
                            (Item) items.get(i * 2)
                    )
            );
        }
    }

    public static void main(String[] args) {
        new PaperScissorsRock().test();
    }
}
