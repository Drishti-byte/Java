/*program to find base to the power n*/
import java.util.Scanner;
public class loops23 {
    public static void main(String args[])
    {
        System.out.println("Enter base and power:");
        try (Scanner sc = new Scanner(System.in)) {
            int base = sc.nextInt();
            int pow = sc.nextInt();
            int result = 1,p;
            p = pow;
            while(pow != 0)
            {
                result = result * base;
                pow --;
            }
            System.out.println("The answer of "+base+" to the power "+p+" is "+result);
        }
    }
}
