/*Demonstrate multi-level inheritance*/
import java.util.*;
class Marks
{
    protected int marks[] = new int[3];
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter marks:");
        for(int i = 0;i < 3;i++)
        {
            System.out.println("Enter marks in "+(i+1)+" subject:");
            marks[i] = sc.nextInt();
        }
    }
    void display()
    {
        for(int i = 0;i < 3;i++)
        {
            System.out.println("Marks in "+(i+1)+" subject:"+marks[i]);
        }
    }
}
class Total extends Marks 
{
    protected int total = 0;
    void totalmarks()
    {
        for(int i = 0;i < 3;i++)
        {
            total = total + marks[i];
        }
        System.out.println("Total marks: "+total);
    }
}
class Per extends Total 
{
    protected int percentage;
    void per()
    {
        percentage = total/3;
        System.out.println("Percentage: "+percentage);
    }
}
public class lab23 {
    public static void main(String args[])
    {
        Per p = new Per();
        p.input();
        p.totalmarks();
        p.per();
    }
}