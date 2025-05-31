/*program to print sum of two numbers*/
import java.util.Scanner;
public class lab5 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0,diff,p,rem;
            sum = a + b;
            System.out.println("The sum of "+a+" and "+b+" is "+sum);
        }
    }
}