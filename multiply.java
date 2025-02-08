/*program to multiply two numbers*/
import java.util.*;
public class multiply {
    public static void main(String args[])
    {
       try(Scanner sc = new Scanner(System.in))
       {
           System.out.println("Enter two numbers:");
           int num1 = sc.nextInt();
           int num2 = sc.nextInt();
           System.out.println("Product is "+(num1 * num2));
       }
    }
}