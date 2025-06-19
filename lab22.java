/*Create a class member*/
import java.util.*;
class Member 
{
    protected String name;
    protected int age;
    protected int phone;
    protected String address;
    protected int salary;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter phone:");
        phone = sc.nextInt();
        System.out.println("Enter address:");
        address = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextInt();

    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
        System.out.println("Address: "+address);
    }
    void printSalary()
    {
        System.out.println("Salary: "+salary);
    }
}
class Employee extends Member 
{
    protected String specialization;
    void input()
    {
        super.input();
        System.out.println("Enter specialization:");
        sc.nextLine();
        specialization = sc.nextLine();
    }
    void display()
    {
        super.display();
        super.printSalary();
        System.out.println("Specialization: "+specialization);
    }
}
class Manager extends Member 
{
    protected String department;
    void input()
    {
        super.input();
        System.out.println("Enter department:");
        sc.nextLine();
        department = sc.nextLine();
    }
    void display()
    {
        super.display();
        super.printSalary();
        System.out.println("Department: "+department);
    }
}
public class lab22 {
    public static void main(String args[])
    {
        Manager m = new Manager();
        m.input();
        m.display();
    }
}