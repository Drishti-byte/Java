/*program to print even numbers till n*/
import java.util.*;
public class loops3 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            for(int i=2; i <= num;i += 2)
            {
                System.out.println(i);
            }
        }
    }
}