import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // Arraylist is a resizeable array of objects with autoboxing
        // Arrays are fixed in size but arraylists can change

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Cococnut");

        System.out.println(fruits);
        fruits.remove(1);
        System.out.println(fruits);
        fruits.add("Pineapple");
        System.out.println(fruits);
        fruits.remove(3);
        fruits.add(1,"Pineapple");
        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
