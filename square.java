/*program to find the square of the number*/
import java.util.*;
public class square {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int res = num * num;
            System.out.println("Square of "+num+" is "+res);
        }
    }
}