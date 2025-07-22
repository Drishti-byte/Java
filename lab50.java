/*program to implement call by reference*/
import java.util.*;
public class lab50 {
    static int sum(int x,int y)
    {
        int sum = 0;
        sum = x + y;
        return sum;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+sum(a,b));
    }
}