/*program to implement interfaces*/
import java.util.*;
interface Standard 
{
    void input();
    void show();
    int getID();
    void setID(int id);
}
class Employee implements Standard 
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
    public int getID()
    {
        return empid;
    }
    public void setID(int id)
    {
        empid = id;
    }
}
public class interfaces 
{
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.input();
        e.show();
    }
}