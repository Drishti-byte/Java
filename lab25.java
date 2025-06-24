/*Uses of super keyword*/
import java.util.*;
class Student 
{
    protected int id;
    protected String name;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter id:");
        id = sc.nextInt();
        System.out.println("Enter name:");
        sc.nextLine();
        name = sc.nextLine();
    }
    void display()
    {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
}
class StudentDetails extends Student 
{
    protected String address;
    protected int phone;
    void input()
    {
        super.input();
        System.out.println("Enter address:");
        address = sc.nextLine();
        System.out.println("Enter phone:");
        phone = sc.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phone);
    }
}
public class lab25 {
    public static void main(String args[])
    {
        StudentDetails sd = new StudentDetails();
        sd.input();
        sd.display();
    }
}