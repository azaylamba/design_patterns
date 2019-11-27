package thinkinginpatterns.main;

/**
 * A singleton class using lazy initialization where object will be created when requested first time.
 * Again making this final to prevent use of inheritance and clone.
 *
 */
public class LazySingleton {
    //Initialize with null
    private static LazySingleton instance = null;
    private int id;

    private LazySingleton(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LazySingleton: " + id;
    }

    //This is the only way to create object of this class
    public static LazySingleton getInstance() {
        if(null == instance) {
            instance = new LazySingleton(47);
        }
        return instance;
    }
}
