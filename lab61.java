/*program to implement single inheritance*/
import java.util.*;
class Person 
{
    protected int pid;
    protected String pname;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter person id:");
        pid = sc.nextInt();
        System.out.println("Enter person name:");
        pname = sc.nextLine();
    }
    void display()
    {
        System.out.println("Person Id: "+pid);
        System.out.println("Person Name: "+pname);
    }
}
class Student extends Person 
{
    protected int sid;
    protected String sname;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter student id:");
        sid = sc.nextInt();
        System.out.println("Enter student name:");
        sc.nextLine();
        sname = sc.nextLine();
    }
    void display()
    {
        System.out.println("Student ID: "+sid);
        System.out.println("Student Name: "+sname);
    }
}
class Exam extends Student 
{
    int marks[] = new int[5];
    Scanner sc = new Scanner(System.in);
    void input()
    {
        super.input();
        System.out.println("Enter marks in five subjects:");
        for(int i = 0;i < 5;i++)
        {
            System.out.println("Enter marks in "+(i+1)+" subject:");
            marks[i] = sc.nextInt();
        }
    }
    void display()
    {
        super.display();
        System.out.println("The marks of student are: ");
        for(int i = 0;i < 5;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
public class lab61 {
    public static void main(String[] args) {
        Exam e = new Exam();
        e.input();
        e.display();   
    }
}