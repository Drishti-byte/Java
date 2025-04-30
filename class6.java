/*program to create a class distance*/
import java.util.*;
class distance{
    private int km;
    private int m;
    public distance() //Default constructor
    {
        km = 100;
        m = 100;
    }
    public distance(int a,int b) //Parameterized Constructor
    {
        km = a;
        m = b;
    }
    public void input()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter kilometers:");
            km = sc.nextInt();
            System.out.println("Enter meteres:");
            m = sc.nextInt();
        }
    }
    public void show()
    {
        System.out.println("Kilometers: "+km);
        System.out.println("Meters: "+m);
    }
    public int getKM()
    {
        return km;
    }
    public int getM()
    {
        return m;
    }
    public void setKM(int c)
    {
        km = c;
    }
    public void setM(int d)
    {
        m = d;
    }
}
public class class6 {
    public static void main(String args[])
    {
        distance d1 = new distance();
        distance d2 = new distance();
        d1.input();
        d2.input();
        d1.show();
        d2.show();
        if(d1.getKM() > d2.getKM())
        {
            System.out.println("Kilometers of first object is greater");
        }
        else 
        System.out.println("Kilometers of second object is greater");
    }
}