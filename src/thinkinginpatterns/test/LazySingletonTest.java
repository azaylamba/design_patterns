package thinkinginpatterns.test;

import thinkinginpatterns.main.LazySingleton;

public class LazySingletonTest {
    public static void main(String[] args) {
        int updatedId = 50;
        //Create object
        LazySingleton l1 = LazySingleton.getInstance();
        System.out.println(l1);
        //Update value
        l1.setId(updatedId);
        System.out.println(l1);
        //Try to get second instance
        LazySingleton l2 = LazySingleton.getInstance();
        //This will show that second instance is same as first instance created
        System.out.println(l2);
    }
}
