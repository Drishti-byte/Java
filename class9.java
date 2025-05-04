/*program to create a class employee using abstract concepts*/
import java.util.*;
abstract class Employee 
{
    protected int empid;
    protected String name;
    protected int salary;
    Scanner sc = new Scanner(System.in);
    public void input()
    {
        System.out.println("Enter empid:");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextInt();
    }
    public void show()
    {
        System.out.println("Empid: "+empid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    abstract void total_salary();
}
class Worker extends Employee 
{
    protected int overtime;
    protected int total;
    public void input()
    {
        super.input();
        System.out.println("Enter your overtime wages:");
        overtime = sc.nextInt();
    }
    public void show()
    {
        super.show();
        System.out.println("Overtime earned is: "+overtime);
    }
    public void total_salary()
    {
        System.out.println("Total salary is: "+(salary+overtime));
    }
}
class Salesman extends Employee 
{
    protected int comm;
    protected int ts;
    public void input()
    {
        super.input();
        System.out.println("Enter sales: ");
        ts = sc.nextInt();
    }
    public void show()
    {
        comm = 10*ts/100;
        super.show();
        System.out.println("Commission earned is: "+comm);
    }
    public void total_salary()
    {
        System.out.println("Total salary is: "+(salary+comm));
    }
}
public class class9 {
    public static void main(String args[])
    {
        Employee e = new Worker();
        e.input();
        e.show();
        e.total_salary();
    }
}