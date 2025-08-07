/*program to implement university*/
import java.util.*;
class Student 
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
        System.out.println("Student id: "+sid);
        System.out.println("Student name: "+sname);
    }
}
class Exam extends Student 
{
    protected int eid;
    protected String ename;
    int marks[] = new int[5];
    Scanner sc = new Scanner(System.in);
    void input()
    {
        super.input();
        System.out.println("Enter exam id:");
        eid = sc.nextInt();
        System.out.println("Enter exam name:");
        sc.nextLine();
        ename = sc.nextLine();
        System.out.println("Enter marks:");
        for(int i = 0;i < 5;i++)
        {
            System.out.println("Marks in "+(i+1)+" subject:");
            marks[i] = sc.nextInt();
        }
    }
    void display()
    {
        super.display();
        System.out.println("Exam id: "+eid);
        System.out.println("Exam name: "+ename);
        System.out.println("Marks are:");
        for(int i = 0;i < 3;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
class Results extends Exam  
{
    int sportsmarks[] = new int[5];
    int total;
    void input()
    {
        super.input();
        System.out.println("Enter sports grace marks:");
        for(int j = 0;j < 3;j++)
        {
            sportsmarks[j] = sc.nextInt();
        }
    }
    void display()
    {
        super.display();
        System.out.println("Marks are:");
        for(int k = 0;k < 3;k++)
        {
            System.out.println(sportsmarks[k]);
        }
    }
}
public class lab63 {
    public static void main(String[] args) {
        Results r = new Results();
        r.input();
        r.display();
    }
}