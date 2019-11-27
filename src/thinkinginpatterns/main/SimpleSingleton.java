package thinkinginpatterns.main;

/**
 * A simple singleton class.
 * Making the class final makes sure that object is not created through inheritance
 * and it also prevents use of clone() method because it is directly inherited from Object class where clone is protected.
 *
 */
final public class SimpleSingleton {
    private static SimpleSingleton instance = new SimpleSingleton(47);
    private int id;
    //private constructor to make sure that object cannot be created from outside
    //and it also prevents use of default constructor
    private SimpleSingleton(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "SimpleSingleton: " + id;
    }
}
