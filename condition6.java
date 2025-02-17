/*program to check whether there is profit or loss*/
import java.util.*;
public class condition6 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the CP and SP:");
            int CP = sc.nextInt();
            int SP = sc.nextInt();
            if(CP > SP)
            {
                int loss = CP - SP;
                System.out.println("Oh! There is a loss of "+loss);
            }
            else 
            {
                int profit = SP - CP;
                System.out.println("Hurray! There is a profit of "+profit);
            }
        }
    }
}