/*program to print the greatest number out of three numbers*/
import java.util.*;
public class condition4 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter three numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a > b && a > c)
            {
                System.out.println(a+" is greatest");
            }
            else if(b > a && b > c)
            {
                System.out.println(b+" is greatest");
            }
            else 
            {
                System.out.println(c+" is greatest");
            }
        }
    }
}