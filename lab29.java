/*program to implement divide by zero using try-catch*/
import java.util.*;
public class lab29 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum: "+(a+b));
        System.out.println("Difference: "+(a-b));
        System.out.println("Product: "+(a*b));
        try
        {
            System.out.println("Quotient: "+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero not possible");
        }
        catch(Exception ex)
        {
            System.out.println("Error!!!");
        }
        finally 
        {
            System.out.println("Exception handled");
        }
    }
}