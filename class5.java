/*program to make constructors*/
import java.util.*;
class Time{
    Scanner sc = new Scanner(System.in);
    private int hours,mins,seconds;
    public Time() //Default constructor
    {
        hours = 12;
    }
    public Time(int x,int y,int z) //Paramterized constructor
    {
        hours = x;
        mins = y;
        seconds = z;
    }
    public void input(){
        System.out.println("Enter hours:");
        hours = sc.nextInt();
        System.out.println("Enter minutes:");
        mins = sc.nextInt();
        System.out.println("Enter seconds:");
        seconds = sc.nextInt();
    }
    public void show(){
        System.out.println("Time is "+hours+" : "+mins+" : "+seconds);
    }
    public int getHours() //Accessor Method
    {
        return hours;
    }
    public void setHours(int x) //Mutator Method
    {
        hours = x;
    }
}
public class class5 {
    public static void main(String args[])
    {
        Time t1,t2;
        t1 = new Time();
        t2 = new Time(10,20,30);
        t1.show();
        t2.show();
        t1.input();
        t2.input();
        t1.show();
        t2.show();
        if(t1.getHours() > t2.getHours())
        System.out.println("First time is greater");
        else 
        System.out.println("Second time is greater");
    }
}