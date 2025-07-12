/*program to create a class simple interest*/
import java.util.*;
class si 
{
    int t,r,p;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter principal amount: ");
        p = sc.nextInt();
        System.out.println("Enter rate of interest: ");
        r = sc.nextInt();
        System.out.println("Enter time(yrs): ");
        t = sc.nextInt();
    }
    void display()
    {
        System.out.println("Principal amount: "+p);
        System.out.println("Rate of interest: "+r);
        System.out.println("Time: "+t);
    }
    void calculate()
    {
        int si;
        si = (p * r * t)/100;
        System.out.println("Simple interest: "+si);
    }
}
public class lab41 {
    public static void main(String[] args) {
        si s = new si();
        s.input();
        s.display();
        s.calculate();
    }
}