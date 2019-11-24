package io.turntabl.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("name", "erbynn");
        myMap.put("email", "pk@turntabl.io");
        myMap.put("address", "taifa accra ghana africa world universe");

        System.out.println(myMap.get("name"));

//        printing all keys
        Set<String> keys = myMap.keySet();
        System.out.println(keys);

//        printing all values
        for (String key :
                keys) {
            System.out.println(myMap.get(key));
        }

        // key search
        if (myMap.containsKey("name")) {
            System.out.println(myMap.get("name") + " is present");
        }

        // size
        System.out.println("Size of map: " + myMap.size());

        // clear map
        myMap.clear();
        System.out.println("map now: " + myMap);

        if(myMap.isEmpty()) System.out.println("empty map");
        else System.out.println("non-empty map");
    }
}
