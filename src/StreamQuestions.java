import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamQuestions {
    static void main(String[] args) {
        /*
            Given a list of integers,
            use a stream to filter out even numbers
            and return them as a new list.
         */
        List<Integer> numList = new ArrayList<>();
        numList = List.of(9, 2, 3, 4, 5, 6, 7, 8, 1);
        numList.forEach(System.out::println);

        numList.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        /*
            Convert a list of strings to uppercase using streams.
         */
        List<String> names = new ArrayList<>();
        names = List.of("sooraj", "seena", "sidharth", "adarsh");
        names.forEach(n -> System.out.print(n + " "));

        System.out.println();
        List<String> toUpper = names.stream()
                .map(String::toUpperCase)
                .toList();
        toUpper.forEach(System.out::println);

        /*
            Given a list of strings, find the longest string using streams.
         */
        String longest = (names.stream()
                .max(Comparator.comparingInt(String::length)))
                .orElse("No names found");
        System.out.println("\nLongest Name: " + longest);

        /*
            Count how many elements in a list satisfy a condition (e.g., numbers greater than 10).
         */
        List<Integer> integerList = new ArrayList<>();
        integerList = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
        System.out.println("Integers greater than 40: ");
        integerList.stream()
                .filter(n -> n > 40)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\nIntegers greater than 40 and less than 80: ");
        integerList.stream()
                .filter(n -> n > 40 && n < 80)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\nSum of all integers: " + integerList.stream()
                .mapToInt(Integer::intValue).sum());

        System.out.println("\nAverage of all Integers: " + integerList.stream()
                .mapToDouble(Integer::intValue).average().orElse(0.0));

        /*
            Sort a list of strings alphabetically using streams, then reverse the order.
         */
        System.out.println();
        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));

        /*
            Convert a list of integers into a comma-separated String using Collectors.joining.
         */
        String joined = integerList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("\n" + joined);
        /*
            Given a List<Student>, group students by grade using Collectors.groupingBy.
         */
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sooraj", 'A'));
        students.add(new Student(2, "Seena", 'B'));
        students.add(new Student(3, "Sidharth", 'C'));
        students.add(new Student(4, "Adarsh", 'A'));
        students.add(new Student(5, "John", 'E'));
        students.add(new Student(6, "Doe", 'E'));
        Map<Character, List<Student>> groupByGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
        groupByGrade.forEach((k, v) -> System.out.println(k + "-" + v + " "));

        /*
            Given a List<Employee>, find the average salary per department using groupingBy + averagingDouble.
         */
        List<StreamEmployee> employees = new ArrayList<>();
        employees.add(new StreamEmployee(1, "Adarsh", "CS", 50));
        employees.add(new StreamEmployee(2, "Sooraj", "Mech", 60));
        employees.add(new StreamEmployee(3, "Sidharth", "CS", 60));
        employees.add(new StreamEmployee(4, "Seena", "EC", 70));
        employees.add(new StreamEmployee(5, "Aswin", "CS", 68));

        Map<String, Double> salaryAverage = employees.stream()
                .collect(Collectors.groupingBy(StreamEmployee::getDept, Collectors.averagingDouble(StreamEmployee::getSalary)));
        salaryAverage.forEach((k, v) -> System.out.println(k + " " + v + " "));

        /*
            Given a list of Integers, remove duplicates and sort them in descending order
         */
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 1, 3, 2, 5, 4));
//        Set<Integer> uniqueDescendingIntegers = list.stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toCollection(LinkedHashSet::new));
//        uniqueDescendingIntegers.forEach(n-> System.out.print(n+" "));

        //OR

        List<Integer> uniqueDescendingIntegers = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(uniqueDescendingIntegers);

        /*
            Form a list of integers, find all the odd numbers and return their squares
         */
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> oddSquares = list1.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .toList();
        System.out.println(oddSquares);

        /*
            From a list of Integers, get 2nd and 3rd elements from it and return them as a list
         */
        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
        list2.stream()
                .skip(1)
                .limit(2)
                .forEach(n -> System.out.print(n + " "));

        /*
            Find the second-highest number from a list
         */
        System.out.println();
        list2.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1).limit(1)// or .findFirst()
                .forEach(System.out::println);

        /*
            Divide the numbers into even and odd
         */
        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerList1.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 1))
                .forEach((k, v) -> System.out.println(k + "->" + v));

        System.out.println("Longest name: " + names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("Not found"));

        /*
            Find the first Employee whose salary is greater than 50000
         */

        Optional<StreamEmployee> first = employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .findFirst();
        if (first.isPresent()) {
            System.out.println("First employee with more than 50000 salary: " + first);
        } else {
            System.out.println("No employee found with more than 50000 salary");
        }

        /*
            Find top 2 highest paid employees
         */
        List<StreamEmployee> list3 = employees.stream()
                .sorted(Comparator.comparing(StreamEmployee::getSalary).reversed())
                .limit(2)
                .toList();
        System.out.println(list3);

        /*
            sort employees by name
         */
        employees.stream()
                .sorted(Comparator.comparing(StreamEmployee::getName))
                .forEach(System.out::println);

        /*
            sort employees by their salary then by their name
         */
        System.out.println();
        employees.stream()
                .sorted((emp1, emp2) -> {
                    if (emp1.getSalary() > emp2.getSalary()) {
                        return 1;
                    } else if (emp1.getSalary() < emp2.getSalary()) {
                        return 2;
                    } else {
                        return emp1.getName().compareTo(emp2.getName());
                    }
                })
                .toList()
                .forEach(System.out::println);

        /*
            Given a list of Student objects, partition them into pass/fail using Collectors.partitioningBy.
         */
        students.stream()
                .collect(Collectors.partitioningBy(student -> student.getGrade() != 'E'))
                .forEach((k, v) -> System.out.println(k + "->" + v));

        /*
            Find the frequency of each element in a list of integers
         */

        System.out.println();
        List<Integer> list4 = Arrays.asList(3, 2, 3, 4, 4, 1, 2, 1, 1, 1, 5, 6, 5);
        list4.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + "->" + v));

        /*
            Find how many employees are from each department
         */
        System.out.println();
        employees.stream()
                .collect(Collectors.groupingBy(StreamEmployee::getDept, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + "->" + v));

        /*
            Find total transaction amount per category
         */
        System.out.println();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Food", 100));
        transactions.add(new Transaction("Food", 200));
        transactions.add(new Transaction("Food", 150));
        transactions.add(new Transaction("Shopping", 300));
        transactions.add(new Transaction("Shopping", 250));
        transactions.add(new Transaction("Shopping", 100));
        transactions.add(new Transaction("Utilities", 400));
        transactions.add(new Transaction("Utilities", 300));
        transactions.add(new Transaction("Entertainment", 500));
        transactions.add(new Transaction("Entertainment", 200));
        transactions.add(new Transaction("Travel", 700));
        transactions.add(new Transaction("Travel", 300));

        transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCategory, Collectors.summingDouble(Transaction::getAmount)))
                .forEach((k, v) -> System.out.println(k + "->" + v));

        /*
            Find the average salary of employees in each department
         */

        System.out.println();
        employees.stream()
                .collect(Collectors.groupingBy(StreamEmployee::getDept, Collectors.averagingDouble(StreamEmployee::getSalary)))
                .forEach((k, v) -> System.out.println(k + "->" + v));

        /*
            Find highest paid employee in each department
         */

        System.out.println();
        Map<String, Optional<StreamEmployee>> collect = employees.stream()
                .collect(Collectors.groupingBy(StreamEmployee::getDept, Collectors.maxBy(Comparator.comparingDouble(StreamEmployee::getSalary))));

        if (collect.isEmpty()) {
            System.out.println("Something went wrong");
        } else {
            collect.forEach((k, v) -> System.out.println(k + "->" + v));
        }

        /*
            Convert the list of employees into a comma-separated string of employee names
         */

        System.out.println();
        System.out.println(employees.stream()
                .map(StreamEmployee::getName)
                .collect(Collectors.joining(", ")));

        /*
            Find common elements in two different lists
         */

        System.out.println();
        List<Integer> intList1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> intList2 = Arrays.asList(3, 4, 5, 6);
        intList1.stream()
                .filter(intList2::contains)
                .forEach(n -> System.out.print(n + " "));

        /*
            Convert multiple list-list into a single list without repetitions
         */
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(3, 4, 5, 6),
                Arrays.asList(7, 8, 1, 2),
                Arrays.asList(9, 10, 5, 6),
                Arrays.asList(11, 12, 7, 8)
        );

        System.out.println();
        List<Integer> list5 = listOfLists.stream()
                .flatMap(innerList -> innerList.stream()) // takes multiple streams and converts into a single stream
                .distinct()
                .toList();
        System.out.println(list5);

        /*
            Print the names of all employees, without any specific order but the process must be very fast
         */
        employees.parallelStream()// utilizes multiple threads and saves time, but order can be random
                .map(StreamEmployee::getName)
                .toList().forEach(System.out::println);

        /*
            Get total combined salary of all the Employees very fast
         */

        System.out.println();
        Double collect1 = employees.parallelStream()
                .map(StreamEmployee::getSalary).reduce(0.0, (a, b) -> a + b); //reduce is thread safe
        System.out.println(collect1);

        /*
            Get total salary of each department and display in descending order
         */

        System.out.println();
        employees.stream()
                .collect(Collectors.groupingBy(StreamEmployee::getDept, Collectors.summingDouble(StreamEmployee::getSalary)))
                .entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(System.out::println);

        /*
            Given a sentence, find the word that has the highest length
         */
        String s = "I am learning Streams API in Java";
        System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get());

        /*
            remove duplicates from string and return in same order
         */
        System.out.println();
        s.chars().distinct().mapToObj(x -> (char) x)
                .forEach(System.out::print);

        //OR

        System.out.println();
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);

        /*
            Given a sentence find the word that has th 2nd(Nth) highest length
         */
        System.out.println();
        Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .limit(1) //or .findFirst()
                .forEach(System.out::println);

        /*
             find the actual string length of the second-largest word in a sentence
         */
        System.out.println();
        System.out.println(Arrays.stream(s.split(" "))
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get());

        /*
            find the occurance of each word
         */
        String repeatingWordString = "I am Sooraj Sooraj";
        System.out.println();
        System.out.println(Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        /*
            find the words with a specified number of vowels
         */

        int numberOfVowels = 2;
        Arrays.stream(s.split(" "))
                .filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);

        /*
            given a list of integers, divide it into two list of even and odd
         */

        List<Integer> integerArrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerArrayList.stream()
                .collect(Collectors.groupingBy(integer -> integer % 2 == 0, Collectors.toList()))
                .values()
                .forEach(System.out::println);

        /*
            Given a word, find the occurrence of each character
         */
        System.out.println();
        String mississippi = "Mississippi";
        Arrays.stream(mississippi.split(""))
                .collect(Collectors.groupingBy(string -> string, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + "->" + v));

        /*
            find sum of unique elements in an array of integers
         */
        List<Integer> integerList2 = Arrays.asList(1, 6, 7, 8, 1, 1, 8, 8, 7);
        System.out.println(integerList2.stream()
                .distinct().mapToInt(integer -> integer).sum());

        /*
            Given a string find the first non-repeated character
         */
        String hello = "Hello World";
        System.out.println(Arrays.stream(hello.split(""))
                .filter(c -> hello.indexOf(c) == hello.lastIndexOf(c))
                .findFirst().get());
        /*
            Given a string find the first repeated character
         */
        System.out.println(Arrays.stream((hello.split("")))
                .filter(c -> hello.indexOf(c) != hello.lastIndexOf(c))
                .findFirst().get());
        /*
            Group integers by range
         */
        List<Integer> integers = Arrays.asList(2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54);

        integers.stream()
                .collect(Collectors.groupingBy(integer -> (integer / 10) * 10))
                .forEach((k, v) -> System.out.println(k + "->" + v));

        /*
            Find the length of the largest substring
         */

        String string = "abcdefaxyz";
        Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(c -> string.indexOf(c) == string.lastIndexOf(c)))
                .forEach((k, v) -> System.out.println(k + "->" + v));
    }
}


