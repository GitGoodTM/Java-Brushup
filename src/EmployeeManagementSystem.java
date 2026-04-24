import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmployeeManagementSystem {
    /*
    A simple project coined by Claude to understand the following stuff:
    * Predicate - to filter employees
    * Function - transforming data
    * Consumer - logging/printing
    * Supplier - generating default values
    * Lambda chaining
     */

    // ============================================================
    // SAMPLE DATA — pretend this came from a database
    // ============================================================
    public static List<Employee> getEmployees(){
        return new ArrayList<>(Arrays.asList(
                new Employee(1, "Alice", "Engineering", 75000, true),
                new Employee(2, "Bob", "Engineering", 48000, true),
                new Employee(3, "Charlie", "HR", 52000, false),
                new Employee(4,"Diana", "Engineering", 92000, true),
                new Employee(5, "Eve", "HR", 61000, true),
                new Employee(6,"Frank", "Finance", 55000, false),
                new Employee(7, "Grace", "Finance", 87000, true)
        ));
    }

    // ============================================================
    // TASK 1 — filter employees using a Predicate
    // ============================================================
    public static List<Employee> filterEmployees(List<Employee> employees,
                                                 Predicate<Employee> condition){
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees){
            if (condition.test(emp))
                result.add(emp);
        }
        return result;
    }

    // ============================================================
    // TASK 2 — transform Employee to a summary string using Function
    // ============================================================
    public static List<String> transform(List<Employee> employees,
                                         Function<Employee, String> mapper){
        List<String> result = new ArrayList<>();
        for (Employee emp : employees){
            result.add(mapper.apply(emp));
        }
        return result;
    }

    // ============================================================
    // TASK 3 — process each employee using Consumer
    // ============================================================
    public static void process(List<Employee> employees,
                               Consumer<Employee> action){
        for (Employee emp : employees){
            action.accept(emp);
        }
    }

    // ============================================================
    // TASK 4 — get employee by id, return default using Supplier
    // ============================================================
    public static Employee getOrDefault(List<Employee> employees,
                                        int id,
                                        Supplier<Employee> defaultSupplier){
        for (Employee emp : employees){
            if (emp.getId() == id) return emp;
        }
        return defaultSupplier.get();
    }

    //Main
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();

        // Task 1: Using Predicate filter active employees in Engineering
        Predicate<Employee> isActive = emp -> emp.isActive();
        Predicate<Employee> isEngineering = emp -> emp.getDepartment().equalsIgnoreCase("Engineering");
        List<Employee> activeEngineers = filterEmployees(employees, isActive.and(isEngineering));
        System.out.println("=== Active Engineers ===");
        activeEngineers.forEach(emp-> System.out.println(emp));

        // Task 2: Using Function transform to name + salary summary
        Function<Employee, String> toSummary = emp -> emp.getName() + " earns $" + emp.getSalary();
        List<String> summaries = transform(activeEngineers, toSummary);
        System.out.println("\n=== Salary Summaries ===");
        summaries.forEach((s -> System.out.println(s)));

        // Task 3: Using consumer give 10% raise to low earners, log it
        Consumer<Employee> logEmployee = emp -> System.out.println("Processing: "+ emp.getName());
        Consumer<Employee> printSalary = emp -> System.out.println("Salary: $ "+ emp.getSalary());
        System.out.println("\n=== Low Earners ===");
        Predicate<Employee> isLowEarner = emp -> emp.getSalary() < 60000;
        List<Employee> lowEarners = filterEmployees(employees, isLowEarner);
        process(lowEarners, logEmployee.andThen(printSalary)); // chaining

        // Task 4: Using Supplier find employee by id or return default
        Supplier<Employee> defaultEmployee = () -> new Employee(0, "Unknown", "N/A", 0, false);
        Employee found = getOrDefault(employees, 3, defaultEmployee);
        Employee notFound = getOrDefault(employees, 99, defaultEmployee);

        System.out.println("\n=== Find by ID ===");
        System.out.println("ID 3: " + found);
        System.out.println("ID 99: " + notFound);
    }
}
