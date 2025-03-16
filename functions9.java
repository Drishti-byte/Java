/*program to print greater of two numbers using functions*/
import java.util.*;
public class functions9 {
    public static void greater(int n1, int n2)
    {
        if(n1 > n2)
        System.out.println(n1+" is greater than "+n2);
        else 
        System.out.println(n2+" is greater than "+n1);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter two numbers:");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            greater(n1,n2);
        }
    }
}