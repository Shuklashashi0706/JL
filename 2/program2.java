import java.util.*;

class Employee {
    String name;
    int emp_id;
    String department;
    int age;
    String designation;
    double salary;

    Employee(String name, int emp_id, String department, int age, String designation, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.department = department;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}

public class program2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        // Add employees to the list
        employees.add(new Employee("John", 1, "sales", 30, "manager", 50000));
        employees.add(new Employee("Jane", 2, "sales", 32, "executive", 40000));
        employees.add(new Employee("Bob", 3, "purchase", 35, "manager", 60000));
        employees.add(new Employee("Alice", 4, "purchase", 28, "executive", 45000));
        employees.add(new Employee("Charlie", 5, "HR", 25, "executive", 35000));

        // Display details of all employees
        for (Employee e : employees) {
            System.out.println("Name: " + e.name + ", Emp_id: " + e.emp_id + ", Department: " + e.department + ", Age: " + e.age + ", Designation: " + e.designation);
        }

        // Calculate and display the sum of salary of all the employees of "sales" department
        double sum = 0;
        for (Employee e : employees) {
            if (e.department.equals("sales")) {
                sum += e.salary;
            }
        }
        System.out.println("Sum of salary of all the employees of 'sales' department: " + sum);

        // Retrieve the details of "highest paid manager" in the purchase department
        Employee highestPaidManager = null;
        for (Employee e : employees) {
            if (e.department.equals("purchase") && e.designation.equals("manager")) {
                if (highestPaidManager == null || e.salary > highestPaidManager.salary) {
                    highestPaidManager = e;
                }
            }
        }
        if (highestPaidManager != null) {
            System.out.println("Highest paid manager in the purchase department: " + highestPaidManager.name);
        }
    }
}
