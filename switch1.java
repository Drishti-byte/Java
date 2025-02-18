/*program to print greeting*/
import java.util.*;
public class switch1 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int button = sc.nextInt();
            switch(button)
            {
                case 1: System.out.println("Hello");
                break;
                case 2: System.out.println("Namaste");
                break;
                case 3: System.out.println("Bonjour");
                break;
                default: System.out.println("Invalid option");
            }
        }
    }
}