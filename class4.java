/*program to create a class time*/
import java.util.*;
class time 
{
    private int hours,minutes,seconds;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter hours:");
        hours = sc.nextInt();
        System.out.println("Enter minutes:");
        minutes = sc.nextInt();
        System.out.println("Enter seconds:");
        seconds = sc.nextInt();
    }
    void show()
    {
        System.out.println("Time: "+hours+" : "+minutes+" : "+seconds);
    }
}
public class class4 {
    public static void main(String args[])
    {
        time a,b;
        a = new time();
        b = new time();
        a.input();
        b.input();
        a.show();
        b.show();
    }
}