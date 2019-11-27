package thinkinginpatterns.test;

import thinkinginpatterns.main.SimpleSingleton;

public class SimpleSingletonTest {
    public static void main(String[] args) {
        //Get instance of SimpleSingleton class
        SimpleSingleton s1 = SimpleSingleton.getInstance();
        System.out.println(s1);
        //Try to create another instance using clone
        //It will throw compile time error because clone is protected in Object class
        //SimpleSingleton s2 = (SimpleSingleton) s1.clone();

        //Change id of object created above
        s1.setId(50);
        System.out.println(s1);
        //Now create new object
        SimpleSingleton s3 = SimpleSingleton.getInstance();
        //Printing this will show that same object is returned in get instance
        System.out.println(s3);
    }
}
