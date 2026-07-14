//import java.util.*;
//
//public class CollectionsFrameworkDemo {
//    static void main(String[] args) {
//
//        /*
//          List: A dynamic array which doesn't need its limits to be declared
//          It scales up as per the user i/p
//         */
//        System.out.println("List/ArrayList\n");
//        List<Integer> list = new ArrayList<>(); // ArrayList class implements the interface List
//        list.add(1); // adds an element to the list
//        list.add(2);
//        list.add(3);
//        System.out.println("List: " + list); // [1,2,3]
//        list.add(1,50); // adds 50 at index 1
//        System.out.println("After adding 50 at index 1: " + list); // [1,50,2,3]
//
//        List<Integer> newList = new ArrayList<>(List.of(10,20,30));
//        System.out.println("newList: " + newList);
//        list.addAll(newList); // adds all elements of newList to list
//        System.out.println("Min element: " + Collections.min(list) + " max element: " +  Collections.max(list)); // gets the min and max value
//        System.out.println("Frequency of 10 in list: " + Collections.frequency(list, 10)); // 1 since 10 only occurs once
//        System.out.println("List after adding newList: " + list); // [1,50,2,3,10,20,30]
//        System.out.println("Element at index 3: " + list.get(3)); // 3
//        list.remove(3); //  removes element at index 3
//        System.out.println("List after removing index 3: " + list); // [1,50,2,10,20,30]
//        list.remove(Integer.valueOf(20)); // removes element 20 if present
//        System.out.println("List after removing element 20: " + list); // [1,50,2,10,30]
//        list.set(0, 100); // sets/replaces element at index 0 with 100
//        System.out.println("List after setting element 100 at index 0: " + list); // [100,50,2,10,30]
//        System.out.println("Does list have 60?: " + list.contains(60)); // false
//        System.out.println("List size now: " + list.size()); // 5
//        Collections.sort(list); // sorts the list in ascending order
//        Collections.reverse(list); // reverses the list
//        Collections.sort(list, Comparator.reverseOrder());
//        //list.clear(); // clears the entire list
//        //System.out.println("List after clearing: " + list); // []
//
//        /*
//            Iterator: mechanisms used to iterate through the list
//            three main ways to do this: for loop/ for each loop/ while loop using iterator
//         */
//
//        System.out.println("\nITERATORS: ");
//        //Iterating using for loop
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//            if (i<list.size()-1){
//                System.out.print(", ");
//            }else {
//                System.out.println();
//            }
//        }
//
//        //Iterating using while loop
//        Iterator<Integer> itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next());
//            if (itr.hasNext()){
//                System.out.print(", ");
//            }else {
//                System.out.println();
//            }
//        }
//
//        //Iterating using forEach loop
//        for (Integer integer : list) {
//            System.out.print(integer);
//            if(Objects.equals(integer, list.getLast())){
//                System.out.println();
//            } else  {
//                System.out.print(", ");
//            }
//        }
//
//        /*
//            Stack: it is basically a Last in-first out list, like a box of cookies
//         */
//
//        System.out.println("\nSTACK:");
//        Stack<String> animals = new Stack<>();
//        animals.push("cat"); // push adds elements to the top of the stack
//        animals.push("dog");
//        animals.push("squirrel");
//        animals.push("fish");
//        System.out.println("Stack of animals: " + animals); // [cat,dog,squirrel,fish]
//        System.out.println("Peeking at the stack: " + animals.peek()); // returns the element at the top of the stack
//        System.out.println("Popping the stack: " + animals.pop() +"\nstack after popping: "+ animals); //.pop() deletes and returns the top element of the stack
//
//        /*
//            Queue: a First in-First out list like a beverages queue
//         */
//
//        System.out.println("\nQUEUE:");
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(10); // offer adds elements to the end of the queue
//        queue.offer(20);
//        queue.offer(30);
//        queue.offer(40);
//        System.out.println("Queue: " + queue); // [10,20,30,40]
//        System.out.println("Peeking at the queue: " + queue.peek()); // peek() returns the element first in the queue
//        System.out.println("Polling the queue: " + queue.poll() +
//                "\nQueue after poll: " + queue); // poll() deletes and returns the first element of the queue
//
//        /*
//            PriorityQueue: it provides the option of prioritizing certain elements in a regular queue
//         */
//
//        System.out.println("\nPriority Queue:");
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.offer(90);
//        priorityQueue.offer(10);
//        priorityQueue.offer(11);
//        priorityQueue.offer(80);
//        priorityQueue.offer(12);
//        priorityQueue.offer(13);
//        System.out.println("PriorityQueue: " + priorityQueue); // [10,12,11,90,80,13] priority queue takes a minheap approach as default, and the smallest element gets prioritized
//        System.out.println("Peeking at the priority queue: " + priorityQueue.peek()); // 10 as priority is for smallest Integer
//        System.out.println("Polling the priority queue: " + priorityQueue.poll() +
//                "\nPriority queue after polling: " + priorityQueue); // 10 again as similar to the regular queue, it will delete the prioritized element and return it
//        // We can set priority as per our requirement as well using Comparator
//        PriorityQueue<Integer> descenedingPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
//        descenedingPriorityQueue.addAll(priorityQueue);
//        System.out.println("Descending Priority queue: " + descenedingPriorityQueue); // [90,80,12,11,13]
//
//        /*
//            ArrayDeque: a particular queue which allows us to peek on both sides of the queue
//         */
//
//        System.out.println("\nArrayDeque:");
//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
//        arrayDeque.offer(15);
//        arrayDeque.offer(16);
//        arrayDeque.offerFirst(60); // offerFirst adds the element to the first index
//        arrayDeque.offerLast(10); //similarly, offerLast adds the element to the last index, although new elements will get added at the end
//        System.out.println("ArrayDeque: " + arrayDeque); // [60,15,16,10]
//        arrayDeque.offer(17);
//        arrayDeque.offer(18);
//        System.out.println("ArrayDeque: " + arrayDeque); // [60,15,16,10,17,18]
//        // this same logic will work in peek, peekFirst, peekLast and poll, pollFirst and pollLast as well
//
//        /*
//            SETS: a particular list which doesn't allow repetition
//            Starting with HashSet: it creates unique hash for each element
//         */
//
//        System.out.println("\nHashSet:");
//        Set<Integer> hashSet = new HashSet<>();
//        hashSet.add(32);
//        hashSet.add(2);
//        hashSet.add(54);
//        hashSet.add(21);
//        hashSet.add(65);
//        System.out.println("HashSet: " + hashSet); // the order of the list keeps changing in each print
//        System.out.println("Does the hashSet has 10?: "+ hashSet.contains(10)); // returns boolean after checking the presence of the given element
//        System.out.println("Size of the HashSet : "+ hashSet.size());
//        System.out.println("Removing 2 from the HashSet" + hashSet.remove(2) + "\nUpdated hashSet: " + hashSet); // the remove function will return a boolean and will delete the specified element
//        hashSet.clear(); // clears the entire set
//        System.out.println("HashSet after clearing: " + hashSet); //[]
//
//        /*
//            LinkedHashSet: a set which accommodates element linking, elements keep the sequence in which they were added
//         */
//
//        System.out.println("\nLinkedHashSet:");
//        Set<Integer> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add(32);
//        linkedHashSet.add(2);
//        linkedHashSet.add(54);
//        linkedHashSet.add(21);
//        linkedHashSet.add(65);
//        System.out.println("LinkedHashSet: " + linkedHashSet); // [32,2,54,21,65]
//        // all other methods work in the same manner as sets
//
//        /*
//            TreeSet: automatically sorted set
//         */
//
//        System.out.println("\nTreeSet:");
//        Set<Integer> treeSet = new TreeSet<>();
//        treeSet.add(32);
//        treeSet.add(2);
//        treeSet.add(54);
//        treeSet.add(21);
//        treeSet.add(65);
//        System.out.println("TreeSet: " + treeSet); // [2,21,32,54,65] takes ascending order as default
//
//        /*
//            Trying out HashSet of non-primitive dataTypes/Class
//         */
//
//        System.out.println("\nHashSet of a user defined class Student:");
//        Set<Student> studentSet = new HashSet<>();
//        studentSet.add(new Student("Jack", 18));
//        studentSet.add(new Student("Rose", 10));
//        studentSet.add(new Student("Moby", 11));
//        studentSet.add(new Student("Dick", 1));
//        studentSet.add(new Student("Jack", 18)); // Even though rollno 18 is already present in the set, it will print the element twice as the hash is unique
//        // this is happening since the student details are being added as "new Student()" which creates a new object and hash
//        // for this to work properly as intended, we need to implement hashCode() & equals() methods in the student class
//        System.out.println("StudentSet: " + studentSet);
//
//        /*
//            Map: map is sort of a list with keys, you can assign any unique arbitrary key to elements
//         */
//
//        System.out.println("\nMap:");
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Jack", 18);
//        map.put("Rose", 10);
//        map.put("Moby", 11);
//        System.out.println("Map: " + map); // {Rose=10, Jack=18, Moby=11}
//        System.out.println("Does map have the key 10?: "+ map.containsKey("10")); // true
//        map.putIfAbsent("Sooraj",7); // puts the key and the value if not already present in the map
//        System.out.println("Map: " + map); // {Rose=10, Sooraj=7, Jack=18, Moby=11}
//        System.out.println("Iterating through the map:");
//        for(Map.Entry<String, Integer> entry : map.entrySet()){ // entrySet basically gets all the entries from the map
//            System.out.println("Entry: " + entry + " key: " + entry.getKey() + " value: " + entry.getValue()); // "Entry: Sooraj=7 key: Sooraj value: 7"
//        }
//        // we can also choose to iterate over only keys using map.keySet()
//        for (String key : map.keySet()) {
//            System.out.println("Key: " + key + " Value: " + map.get(key));
//        }
//        System.out.println("Does map have the value Sooraj?: "+ map.containsValue("Sooraj")); // true
//        System.out.println("Is the map empty?: "+ map.isEmpty()); // false
//        map.clear(); // clears the entire map
//
//
//        System.out.println("\n Comparing students using Collections");
//        Student student1 = new Student("Jack", 18);
//        Student student2 = new Student("Rose", 11);
//        // to compare the students by roll number or any other way, we need to implement comparable interface on the Student class
//        System.out.println(student2.compareTo(student1)); // it will return -8
//        // this logic will help us to sort the list as well
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(new Student("John", 12));
//        studentList.add(new Student("Moby", 10));
//        studentList.add(new Student("Dick", 1));
//        Collections.sort(studentList);
//        System.out.println("Sorted StudentList: " + studentList);
//    }
//}
