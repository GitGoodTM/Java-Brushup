import java.util.*;
import java.util.stream.Collectors;

public class MoreStreamQuestions {
    public static void main(String[] args) {
        /*
         * Q1. Given a list of integers, remove duplicates and sort them in descending order.
         */
        System.out.println("Q1. Given a list of integers, remove duplicates and sort them in descending order\n");
        List<Integer> integerListist = new ArrayList<>(Arrays.asList(5, 3, 1, 3, 2, 5, 40));

        integerListist.stream()
                .distinct() //removes duplicates
                .sorted(Comparator.reverseOrder()) // sorts in descending order
                .collect((Collectors.toList()))
                .forEach(System.out::println);
        integerListist.clear();
        /*
         * Q2. From a list of integers, find all the odd numbers and return their squares.
         */
        System.out.println("\nQ2. From a list of integers, find all the odd numbers and return their squares\n");
        integerListist = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        integerListist.stream()
                .filter(n-> n%2==1)
                .map(n->n*n)
                .toList()
                .forEach(System.out::println);

        integerListist.clear();

        /*
         * Q3. From a list of integers, print the first and second elements as a new list
         */

        System.out.println("\nQ3. From a list of integers, print the first and second elements as a new list\n");
        integerListist = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        integerListist.stream()
                .skip(1)
                .limit(2)
                .toList()
                .forEach(System.out::println);
        integerListist.clear();
        /*
         * Q4. Find the second highest number in a list
         */
        System.out.println("\nQ4. Find the second highest number in a list\n");
        integerListist = new ArrayList<>(Arrays.asList(20,10,10,45,30,45,5,20));

        integerListist.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .toList()
                .forEach(System.out::println);

        integerListist.clear();
        /*
         * Q5. Divide the given integer list into even and odd.
         */

        System.out.println("\nQ5. Divide the given integer list into even and odd.\n");

        integerListist = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        integerListist.stream()
                .collect(Collectors.partitioningBy(i -> i%2==0))
                .values()
                .forEach(System.out::println);
        integerListist.clear();

        /*
         * Q6. From a list of Strings, find the longest one.
         */
        System.out.println("\nQ6. From a list of Strings, find the longest one.\n");

        List<String> stringList = new ArrayList<>(Arrays.asList("Java", "SpringBoot", "API"));

        Optional<String> maxLength = (stringList.stream()
                .max(Comparator.comparing(String::length)));
        maxLength.ifPresent(System.out::println);
        stringList.clear();

        /*
         * Q7. From a list if employees, find the first employee whose salary is greater than 50000
         */

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(1,"Abhishek","IT",50000,true),
                new Employee(1,"Ankit","IT",70000,true),
                new Employee(1,"Rahul","HR",40000,true),
                new Employee(1,"Tina","HR",45000,true),
                new Employee(1,"Esha","Finance",60000,true),
                new Employee(1,"Naman","Finance",55000,true),
                new Employee(1,"Sachit","IT",80000,true),
                new Employee(1,"Pushp","Marketing",50000,true),
                new Employee(1,"Sumit","Marketing",50000,true)
        ));

        employees.stream()
                .filter(employee -> employee.getSalary()>=50000)
                .forEach(System.out::println);

        /*
         * Q8. From a list of employees, Find top 2 highest paid employees.
         */

        System.out.println("\nQ8. From a list of employees, Find top 2 highest paid employees.\n");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder()))
                .limit(2)
                .forEach(System.out::println);

        /*
         * Q9. Sort the list of employees by their salary and then by their name
         */
        System.out.println("\nQ9. Sort the list of employees by their salary and then by their name\n");

        employees.stream()
                .sorted((employee1, employee2) ->{
                    if(employee1.getSalary()>employee2.getSalary()){
                        return 1;
                    }else if (employee1.getSalary()<employee2.getSalary()) {
                        return -1;
                    } else {
                        return employee1.getName().compareTo(employee2.getName());
                    }
                })
                .forEach(System.out::println);

        /*
         * Q10. From a list of Integer, Find the frequency of each element in a list.
         */
        System.out.println("\nQ10. From a list of Integer, Find the frequency of each element in a list.\n");

        integerListist = new ArrayList<>(Arrays.asList(3,2,3,4,4,1,2,1,1,1,5,6,5));
        integerListist.stream()
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
        integerListist.clear();
        /*
         * Q11. Given a list of employees, count how many employees are in each department
         */
//        System.out.println("\nQ11. Given a list of employees, count how many employees are in each department\n");
//
//        employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
//                .entrySet()
//                .forEach(System.out::println);
    }
}
