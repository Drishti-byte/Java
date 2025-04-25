/*program to create a class student*/
import java.util.*;
class student
{
    private int admno;
    private String name;
    private int marks;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter admission number:");
        admno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter marks:");
        marks = sc.nextInt();
    }
    void show()
    {
        System.out.println("The admission number is "+admno);
        System.out.println("Name is "+name);
        System.out.println("Marks is "+marks);
    }
}
class class1 
{
    public static void main(String args[])
    {
        student a,b;
        a = new student();
        b = new student();
        a.input();
        b.input();
        a.show();
        b.show();
    }
}