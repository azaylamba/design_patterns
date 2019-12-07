package thinkinginpatterns.main.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * An adapter class to load a two dimensional array of String to a map as key value pairs.
 *
 */
public class LoadTwoDArrayToMap {

    String[][] internalArr;
    Map<String, String> internalMap;

    public LoadTwoDArrayToMap(String[][] arr) {
        internalArr = arr;
    }

    public Map<String, String> loadMap() {
        internalMap = new HashMap<>(internalArr.length);
        for(String[] arr : internalArr) {
            internalMap.put(arr[0], arr[1]);
        }
        return internalMap;
    }
}
