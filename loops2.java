/*program to print table of a number*/
import java.util.*;
public class loops2 {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int p = 1;
            for(int i=1; i <= 10;i++)
            {
                p = num * i;
                System.out.println(num+"X"+i+"="+p);
            }
        }
    }
}