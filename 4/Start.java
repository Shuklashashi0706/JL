// 4.Write a java program to define a base class called person which 
// stores information about a person such as name, age, gender. Derive
//  two new classes employee and student and extend the base class methods 
//  in derived class to read and display the details that are specific
//   to student and employee. Display the details of at least five students and five employees.
import java.util.Scanner;

class Person {
    String name;
    int age;
    char gender;

    public void read(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
    }
}

class Student extends Person {
    String department, usn;
    int sem;
    float cgpa;

    public void readStudent(String name, int age, char gender, String department, String usn, int sem, float cgpa) {
        read(name, age, gender);
        this.department = department;
        this.usn = usn;
        this.sem = sem;
        this.age = age;
        this.cgpa = cgpa;
    }

    public void displayStudent() {
        System.out.println("");
        display();
        System.out.println("USN:" + usn);
        System.out.println("Department:" + department);
        System.out.println("Sem:" + sem);
        System.out.println("CGPA:" + cgpa);
    }
}

class Employees extends Person {
    String department, designation;
    int empId;
    float salary;

    public void readEmployee(String name, int age, char gender, String department, String designation, int empId,
            float salary) {
        read(name, age, gender);
        this.department = department;
        this.designation = designation;
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("");
        display();
        System.out.println("Employee ID:" + empId);
        System.out.println("Department:" + department);
        System.out.println("Salary:" + salary);
    }
}

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of instances of each class to be created:");
        int n = sc.nextInt();
        Person[] p = new Person[n];
        Student[] s = new Student[n];
        Employees[] e = new Employees[n];
        System.out.println("\nEnter the details of Person:");
        for (int i = 0; i < n; i++) {
            System.out.println();
            p[i] = new Person();
            System.out.print("Enter Name:");
            String name = sc.next();
            System.out.print("Enter Age:");
            int age = sc.nextInt();
            System.out.print("Enter Gender:");
            char gender = sc.next().charAt(0);
            p[i].read(name, age, gender);
        }
        System.out.println("\nEnter the details of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println();
            s[i] = new Student();
            System.out.print("Enter Name:");
            String name = sc.next();
            System.out.print("Enter Age:");
            int age = sc.nextInt();
            System.out.print("Enter Gender:");
            char gender = sc.next().charAt(0);
            System.out.print("Enter USN:");
            String usn = sc.next();
            System.out.print("Enter Department:");
            String department = sc.next();
            System.out.print("Enter Sem:");
            int sem = sc.nextInt();
            System.out.print("Enter CGPA:");
            float cgpa = sc.nextFloat();
            System.out.print(cgpa);
            s[i].readStudent(name, age, gender, department, usn, sem, cgpa);
        }
        System.out.println("\nEnter the details of Employees:");
        for (int i = 0; i < n; i++) {
            System.out.println();
            e[i] = new Employees();
            System.out.print("Enter Name:");
            String name = sc.next();
            System.out.print("Enter Age:");
            int age = sc.nextInt();
            System.out.print("Enter Gender:");
            char gender = sc.next().charAt(0);
            System.out.print("Enter Department:");
            String department = sc.next();
            System.out.print("Enter Designation:");
            String designation = sc.next();
            System.out.print("Enter Employee ID:");
            int empId = sc.nextInt();
            System.out.print("Enter Salary:");
            float salary = sc.nextFloat();
            e[i].readEmployee(name, age, gender, department, designation, empId, salary);
        }
        for (int i = 0; i < n; i++) {
            p[i].display();
        }
        for (int i = 0; i < n; i++) {
            s[i].displayStudent();
        }
        for (int i = 0; i < n; i++) {
            e[i].displayEmployee();
        }
        Employees highestPaidManager = new Employees();
        float max = 0;
        for (int i = 0; i < n; i++) {
            if (e[i].designation.compareTo("manager") == 0) {
                if (e[i].salary > max) {
                    highestPaidManager = e[i];
                }
            }
        }
        System.out.println("\nDetails of Manager with Highest Salary:\n");
        highestPaidManager.displayEmployee();
        sc.close();
    }
}
