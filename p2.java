import java.util.Scanner;

class Employee {
     String name;
     int empId;
     String department;
     int age;
     String designation;
     int salary;

    public void setEmployee(String name, int empId, String department, int age, String designation,int salary) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void getEmployee() {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
        System.out.println("\n");
    }
}

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 2;
        Employee[] employees = new Employee[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Employee ID: ");
            int empId = Integer.parseInt(scanner.nextLine());

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Salary: ");
            int salary = Integer.parseInt(scanner.nextLine());

            employees[i] = new Employee();
            employees[i].setEmployee(name, empId, department, age, designation,salary);
        }

        System.out.println("\nDetails of Employees:\n");
       for(Employee employee : employees){
            employee.getEmployee();
       }
       int sum =0 ;
       for(Employee e : employees){
            if(e.age == 12){
                sum+=e.salary;
                System.out.println(sum);
            }
       }
       System.out.println("Sum of salary is "+ sum);
        scanner.close();
    }
}
