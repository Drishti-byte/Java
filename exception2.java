/*program to implement exceptions*/
import java.util.*;
public class exception2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Product is "+(a * b));
        System.out.println("Quotient is "+(a / b));
        System.out.println("Sum is "+(a + b));
        System.out.println("Difference is "+(a - b));
    }
}