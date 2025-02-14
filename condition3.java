/*program to print greeting*/
import java.util.*;
public class condition3 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int button = sc.nextInt();
            if(button == 1)
            {
                System.out.println("Hello");
            }
            else if(button == 2)
            {
                System.out.println("Namaste");
            }
            else 
            {
                System.out.println("Bonjour");
            }
        }
    }
}