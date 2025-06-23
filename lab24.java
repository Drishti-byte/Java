/*Implement hierarchy*/
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
class StudentExam extends Student 
{
    protected int marks[] = new int[6];
    void input()
    {
        super.input();
        System.out.println("Enter marks:");
        for(int i = 0;i < 6;i++)
        {
            System.out.println("Marks in "+(i+1)+" subject:");
            marks[i] = sc.nextInt();
        }
    }
    void display()
    {
        super.display();
        for(int i = 0;i < 6;i++)
        {
            System.out.println("Marks in "+(i+1)+" subject:"+marks[i]);
        }
    }
}
class StudentResult extends StudentExam 
{
    protected int per;
    protected int total;
    void per()
    {
        for(int i = 0;i < 6;i++)
        {
            total = total + marks[i];
        }
        System.out.println("Total marks are: "+total);
        per = total/6;
        System.out.println("Percentage: "+per);
    }
}
public class lab24 {
    public static void main(String args[])
    {
        StudentExam se = new StudentExam();
        se.input();
        se.display();
        StudentResult sr = new StudentResult();
        sr.per();
    }
}