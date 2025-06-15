/*program to create class student having fields name,id,phone*/
import java.util.*;
class student 
{
    private String name;
    private int id;
    private long phone;
    Scanner sc = new Scanner(System.in);
    student(String n,int i,long ph)
    {
        name = n;
        id = i;
        phone = ph;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Phone: "+phone);
    }
}
public class lab18 {
    public static void main(String args[])
    {
        student s = new student("Drishti",101,453768);
        s.display();
    }
}