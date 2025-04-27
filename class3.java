/*program to create class employee*/
import java.util.*;
class employee 
{
    private int empid;
    private String name;
    private int salary;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter empid:");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextInt();
    }
    void show()
    {
        System.out.println("Empid: "+empid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    void bonus()
    {
        int bonus = 0;
        salary *= (50/100);
        salary += bonus;
        System.out.println("Bonus: "+bonus);
        System.out.println("Salary after bonus: "+salary);
    }
}
public class class3 {
    public static void main(String args[])
    {
        employee a,b;
        a = new employee();
        b = new employee();
        a.input();
        b.input();
        a.show();
        b.show();
        a.bonus();
        b.bonus();
    }
}