/*Create a class person and subclass employee*/
import java.util.*;
class Person 
{
    protected String name;
    protected int age;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends Person 
{
    protected int salary;
    void input()
    {
        super.input();
        System.out.println("Enter salary:");
        salary = sc.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Salary: "+salary);
    }
}
public class lab21 {
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.input();
        e.display();
    }
}