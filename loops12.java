/*program to print half pyramid with numbers*/
import java.util.*;
public class loops12 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("How many rows are there:");
            int r = sc.nextInt();
            for(int i=1; i <= r;i++)
            {
                for(int j=1; j <= i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}