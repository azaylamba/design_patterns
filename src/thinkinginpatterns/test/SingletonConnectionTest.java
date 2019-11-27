package thinkinginpatterns.test;

import thinkinginpatterns.main.SingletonConnection;

/**
 * Test class for {@link SingletonConnection} class where connection creation is tested.
 *
 */
public class SingletonConnectionTest {
    public static void main(String[] args) {
        SingletonConnection sc1 = SingletonConnection.getInstance();
        checkConnectionValidity(sc1);
        SingletonConnection sc2 = SingletonConnection.getInstance();
        checkConnectionValidity(sc2);
        //Now check number of available connections
        System.out.println("Number of available connections: " + SingletonConnection.getNumberOfAvailableConnections());
        //We know that max connections can be 10, create 8 more connections to fill up the limit
        for(int i=1; i<=8; i++) {
            SingletonConnection sc = SingletonConnection.getInstance();
            checkConnectionValidity(sc);
        }
        //Now create one more connection
        SingletonConnection sc3 = SingletonConnection.getInstance();
        System.out.println("Checking validity of extra connection created");
        checkConnectionValidity(sc3);
        //Now close one connection created at the starting
        sc1 = SingletonConnection.closeConnection(sc1);
        //Now check validity of sc1
        System.out.println("Checking validity of sc1");
        checkConnectionValidity(sc1);
        //Now check number of available connections
        System.out.println("Number of available connections: " + SingletonConnection.getNumberOfAvailableConnections());
        //Now create one more connection
        System.out.println("Creating one more new connection");
        SingletonConnection sc4 = SingletonConnection.getInstance();
        System.out.println("Checking validity of sc4");
        checkConnectionValidity(sc4);

        //Now check number of available connections
        System.out.println("Number of available connections: " + SingletonConnection.getNumberOfAvailableConnections());
    }

    private static void checkConnectionValidity(SingletonConnection conn) {
        if(null != conn) {
            System.out.println("Valid connection!");
        } else {
            System.out.println("Null connection!");
        }
    }
}
