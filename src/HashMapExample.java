import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        /* HashMap = A data structure that stores key-value pairs
        * Keys are unique, but values can be duplicated
        * Does not maintain any order, but is memory efficient
        * Syntax: HashMap<Key, Value>*/

        HashMap<String,Double> map = new HashMap<>();

        map.put("Lays", 10.0);
        map.put("Cola", 40.0);
        map.put("Bread", 40.0);
        map.put("Bread", 50.0); // the older entry gets overwritten
        map.put("Apple", 100.0);

        System.out.println(map);

        for (String key: map.keySet()){
            System.out.print(key + ": " + map.get(key) + ", ");
        }
        System.out.println("");

        System.out.println("Size of map: " + map.size());

        map.remove("Apple");

        // checking for presence of a given key
        if(map.containsKey("Apple")){
            System.out.println(map.get("Apple"));
        } else {
            System.out.println("Apple was not found, it has been removed");
            map.put("Apple", 100.0);
            System.out.println("Apple has been added now");
        }

        // checking for the presence of a given value
        map.put("Soap",50.0);

        if (map.containsValue(50.0)){
            System.out.println("Products with value 50.0: ");
            for (String key: map.keySet()){
                if(map.get(key)==50.0){
                    System.out.print(key + ": " + map.get(key) + ", ");
                }
            }
        }else {
            System.out.println("No products of Value 50.0");
        }

    }
}
