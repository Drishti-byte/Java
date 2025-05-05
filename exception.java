/*program to implement try-catch and finally block*/
import java.util.*;
public class exception {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Product is: "+(a * b));
        try
        {
            System.out.println("Quotient is "+(a / b));
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by zero is not possible");
        }
        finally 
        {
            System.out.println("Sum is "+(a + b));
            System.out.println("Difference is "+(a - b));
        }
    }
}