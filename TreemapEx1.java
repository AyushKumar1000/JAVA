import java.util.*;

public class TreemapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "three");
        map.put(5, "five");
        map.put(6, "six");
        map.put(1, "one");
        map.put(2, "two");
        map.put(9, "nine");

        System.out.println("TreeMap: " + map);
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // Creating a headMap view
        SortedMap<Integer, String> hmap = map.headMap(3);
        System.out.println("After headMap(3): " + hmap);

        // Adding a key within the valid range
        hmap.put(0, "zero");  // This is valid since 0 is less than 3
        System.out.println("After put(0, zero) to hmap: " + hmap);
        System.out.println("After put(0, zero) to map: " + map);

        // IllegalArgumentException if we try to put 4 into hmap, because headMap(3) only allows keys < 3
        // hmap.put(4, "four"); // Uncommenting this will cause an exception

        // Adding 4 to the original TreeMap
        map.put(4, "four");
        System.out.println("After put(4, four) to map, hmap: " + hmap);
        System.out.println("After put(4, four) to map, map: " + map);

        // Finding ceiling entry
        System.out.println("The ceiling key-value of 5 is: " + map.ceilingEntry(5));

        Map.Entry<Integer, String> me = map.ceilingEntry(5);
        System.out.println("Ceiling Entry: " + me);
        System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());

        // When no key is greater than or equal to 10, ceilingEntry() returns null
        System.out.println("The ceiling key-value of 10 is: " + map.ceilingEntry(10));

        // Finding the ceiling key for 8
        System.out.println("The ceiling key of 8 is: " + map.ceilingKey(8));

        // Getting a descending view of the map
        System.out.println("Descending Map: " + map.descendingMap());

        // Getting descending keys
        Set<Integer> set = map.descendingKeySet();
        System.out.println("Descending Key Set: " + set);

        // Getting navigable key set
        System.out.println("Navigable Key Set: " + map.navigableKeySet());
    }
}