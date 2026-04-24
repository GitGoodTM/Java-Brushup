import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
    // Class that stores necessary  data for EmployeeManagementSystem

    private int id;
    private String name;
    private String department;
    private double salary;
    private boolean isActive;

    public Employee(int id,
                    String name,
                    String department,
                    double salary,
                    boolean isActive){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.isActive=isActive;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public boolean isActive() { return isActive; }

    @Override
    public String toString(){
        return String.format("Employee{id=%d, name='%s', dept='%s', salary=%.1f, active=%b}",
                id, name, department, salary, isActive);
    }
}
