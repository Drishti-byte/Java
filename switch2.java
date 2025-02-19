/*program to make a calculator*/
import java.util.*;
public class switch2 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter 1-Add 2-Subtract 3-Multilpy 4-Divide 5-Remainder");
            int num = sc.nextInt();
            switch(num)
            {
                case 1: System.out.println(a + b);
                break;
                case 2: System.out.println(a - b);
                break;
                case 3: System.out.println(a * b);
                break;
                case 4: System.out.println(a / b);
                break;
                case 5: System.out.println(a % b);
                break;
                default: System.out.println(" Invalid option");
            }
        }
    }
}
