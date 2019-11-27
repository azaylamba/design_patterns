package thinkinginpatterns.main;

/**
 * A variation of singleton pattern where this class will allow up-to a maximum number of object creation.
 * This class is not thread safe.
 *
 */
@NotThreadSafe
final public class SingletonConnection {
    private static SingletonConnection instance = null;
    private static int numConn = 0;
    private static final int MAX_CONN = 10;

    //Make the constructor private
    private SingletonConnection() {
    }

    /**
     * Returns new connection if max limit is not reached.
     *
     * @return
     */
    public static SingletonConnection getInstance() {
        if(numConn < MAX_CONN) {
            numConn++;
            return new SingletonConnection();
        }
        System.out.println("Limit exhausted, no more connections allowed!");
        return null;
    }

    /**
     * Marks the instance as null and reduces the count of total connections created so far.
     *
     * @param conn
     */
    public static SingletonConnection closeConnection(SingletonConnection conn) {
        conn = null;
        numConn--;
        return null;
    }

    /**
     * @return number of available connections which can be created.
     */
    public static int getNumberOfAvailableConnections() {
        return MAX_CONN - numConn;
    }
}
