package thinkinginpatterns.test.adapter;

import thinkinginpatterns.main.adapter.LoadTwoDArrayToMap;

import java.util.HashMap;
import java.util.Map;

public class LoadTwoDArrayToMapTest {
    public static void main(String[] args) {
        //Two dimensional array of names having first and last names
        String[][] nameArray = {{"Ajay", "Lamba"}, {"Manoj", "Sangwan"}, {"Ashvini", "Lamba"}};
        //An empty map which will be loaded from above array
        LoadTwoDArrayToMap obj = new LoadTwoDArrayToMap(nameArray);
        Map<String, String> loadedMap = obj.loadMap();

        for(Map.Entry<String, String> entry : loadedMap.entrySet()) {
            System.out.println("First name is: " + entry.getKey() + " and last name is: " + entry.getValue());
        }
    }
}
